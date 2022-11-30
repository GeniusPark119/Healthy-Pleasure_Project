package com.ssafit.pjt.model.service;

import java.net.MalformedURLException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.UrlResource;
import org.springframework.stereotype.Service;

import com.ssafit.pjt.model.dao.SkyDao;
import com.ssafit.pjt.model.dto.Sky;

@Service
public class SkyServiceImpl implements SkyService{
	
	private final Path root = Paths.get("upload");
	
	@Autowired
	SkyDao skydao;

	@Override
	public int writeSky(Sky sky) {
		return skydao.insertSky(sky);
	}

	@Override
	public Sky getSky(int skySeq) {
		
		return skydao.selectSky(skySeq);
	}

	@Override
	public List<Sky> getAllSky(int userSeq){
		return skydao.selectAllSky(userSeq);
	}

	@Override
	public int modifySky(Sky sky) {
		return skydao.updateSky(sky);
	}

	@Override
	public int removeSky(int skySeq) {
		return skydao.deleteSky(skySeq);
	}
//
//	@Override
//	public Map<String, Object> getfile(String imgName) {
//		return skydao.selectfile(imgName);
//	}
//
//	@Override
//	public Resource load(String imgName) {
//		try {
//			Path file = root.resolve(imgName);
//			Resource resource = new UrlResource(file.toUri());
//
//			
//			if(resource.exists() || resource.isReadable()) {
//				return resource;
//			} else {
//				throw new RuntimeException("파일을 읽을 수 없습니다.");
//			}
//		} catch (MalformedURLException e) {
//			e.printStackTrace();
//		}
//		return null;
//	}

}
