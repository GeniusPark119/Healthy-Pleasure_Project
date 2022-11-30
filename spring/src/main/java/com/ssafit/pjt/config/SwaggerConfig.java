package com.ssafit.pjt.config;

import org.springframework.context.annotation.Bean;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
public class SwaggerConfig {
	
	@Bean
	public Docket api() {
		final ApiInfo apiInfo = new ApiInfoBuilder().title("SSAFIT 사용자 관리 API")
				.description("<h3>SSAFIT REAT Api 문서 제공</h3>")
				.contact(new Contact("sojung & dahye", "https://ssafit.com", "dhc0404@naver.com")).license("MIT License")
				.version("1.0").build();

		return new Docket(DocumentationType.SWAGGER_2) // Swagger 2.0 기반의 문서 작성
				.apiInfo(apiInfo) // 문서에 대한 정보를 설정한다.
				.select() // ApiSelectorBuilder를 반환하며 상세한 설정 처리
				.apis(RequestHandlerSelectors.basePackage("com.ssafit.pjt.controller"))// 대상으로하는 api 설정
				.paths(PathSelectors.any()) // controller에서 swagger를 지정할 대상 path 설정
				.build();  // Docket 객체 생성
	}

}
