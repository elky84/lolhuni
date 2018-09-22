package com.lol.tracer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.annotations.Api;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.Tag;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket api() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
					.apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
					.paths(PathSelectors.any())
					.build()
	                .apiInfo(apiInfo())
				.tags(new Tag("KeyApi","키 관련 API"),
						new Tag("SummonerApi","소환사 관련 API"),
						new Tag("TargetApi", "타겟 API"),
						new Tag("TestApi", "테스트용 API"));
	}
	
	private ApiInfo apiInfo() {

		return new ApiInfo(
                "LOL Tracer REST API"
                , "REST API Document"
                , "1.0.0"
                , "Terms of service"
                , new Contact("loltracer", "https://github.com/elky84/loltracer", "elky84@gmail.com")
                , ""
                , "");
	}
	
	
}

