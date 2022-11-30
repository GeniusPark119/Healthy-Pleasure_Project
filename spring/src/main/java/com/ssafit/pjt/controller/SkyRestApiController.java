package com.ssafit.pjt.controller;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletContext;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ssafit.pjt.model.dto.Sky;
import com.ssafit.pjt.model.service.SkyService;

@RestController
@RequestMapping("/skyapi")
@CrossOrigin("*")
public class SkyRestApiController {
	
	@Autowired
	SkyService skyservice;
	
	@Autowired
	ResourceLoader resLoader;
	
	 @Autowired
	 private ServletContext servletContext;
	 
	 @PostMapping(value = "/sky", consumes = { MediaType.MULTIPART_FORM_DATA_VALUE })
	 public ResponseEntity<?> addProfileImg(@RequestParam("img") MultipartFile img, Sky sky) throws IllegalStateException, IOException {

		 
		//String uploadPath = servletContext.getRealPath("/file");
		File upload = new File("C:\\upload");
		
		
	    String fileName = img.getOriginalFilename();
	    
	    
	    File target = new File(upload, fileName);
	    
	    if(!upload.exists()) upload.mkdir();
	    
	    System.out.println(target.toString());
//	    if(!new File(uploadPath).exists()) {
	        
//	        File dir = new File(uploadPath);
	        
//	        if(dir.mkdir()) {
//	            System.out.println("생성완료");
//	        }
//	    }
	    
	    if (!img.isEmpty()) {
	        // 파일을 저장할 위치 지정
	        //Resource res = resLoader.getResource("C:\\upload");
	        // meal 객체에 원본 파일 이름 저장
	        sky.setImgName(img.getOriginalFilename());
//	        // 파일 저장
	        img.transferTo(new File(upload + "/" + sky.getImgName()));
	        // 중복방지를 위해 파일 이름앞에 현재 시간 추가
	        sky.setImgUri("/upload" + "/" + sky.getImgName());
	        
	        System.out.println(sky.getImgUri());
	    }
	    LocalDate date = LocalDate.now();
	    sky.setRegDate(date.toString());
	    
	    Date date2 = new Date();
	    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM");
	    String yearMonth = simpleDateFormat.format(date2);
	    sky.setYearMonth(yearMonth);
//
	    int result = skyservice.writeSky(sky);
	    return ResponseEntity.status(HttpStatus.OK).body(1);

	}
	 
	 @GetMapping(value = "/upload/{imgName}", produces = MediaType.IMAGE_PNG_VALUE)
	 public ResponseEntity<byte[]> userSearch(@PathVariable("imgName") String imgName) throws IOException{ 
		 
		 InputStream imageStream = new FileInputStream("C://upload/"+imgName);
		 
		 byte[] imageByteArray = IOUtils.toByteArray(imageStream);
		 
		 imageStream.close();
		 
		 
		 return new ResponseEntity<byte[]>(imageByteArray, HttpStatus.OK);
	 }
	
//	 @GetMapping("/upload/{imgName}")
//		@ResponseBody
//		@ApiOperation(value = "{fileId}에 해당하는 파일 정보를 반환한다.")
//		public ResponseEntity<Resource> getFile(@PathVariable("imgName") String imgName) {
////			Map<String,Object> fileMap = skyservice.getfile(imgName);
//			Resource file = skyservice.load(imgName);
//			System.out.println("이거 실행?");
//			return ResponseEntity.ok()
//			        .header(HttpHeaders.CONTENT_DISPOSITION, "inline")
//			        .header(HttpHeaders.CONTENT_TYPE, "image/png")
//			        .body(file);
////			.header(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=\"" + ((String)fileMap.get("originFile")) + "\"").body(file);
//			
//			
//		}
	
//	@GetMapping("/sky/{skySeq}")
//	public ResponseEntity<?> showSkyboard(@PathVariable int skySeq){
//		Sky result = skyservice.getSky(skySeq);
//		return ResponseEntity.status(HttpStatus.OK).body(result);
//	}
	
	@GetMapping("/sky/{userSeq}")
	public ResponseEntity<List<Sky>> showSkyAll(@PathVariable int userSeq){
		List<Sky> result = skyservice.getAllSky(userSeq);
		System.out.println(result.toString());
		return new ResponseEntity<>(result, HttpStatus.OK) ;
	}
	
	@PutMapping("/sky")
	public ResponseEntity<?> modifySkyboard(Sky sky){
		int result = skyservice.modifySky(sky);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	@DeleteMapping("/sky/{skySeq}")
	public ResponseEntity<?> deleteSkyboard(@PathVariable int skySeq){
		int result = skyservice.removeSky(skySeq);
		return ResponseEntity.status(HttpStatus.OK).body(result);
	}
	
	
}
