package com.springapi.fhir.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@Configuration
@EnableSwagger2
@Import(SwaggerController.class)
public class SwaggerConfig {
    private ApiInfo apiInfo() {
        
        return new ApiInfoBuilder().title("FHIR API").description("FHIR API").license("All Rights Reserved")
                .licenseUrl("https://opensource.org/licenses/AGPL-3.0").termsOfServiceUrl("https://mymhealth.com/terms")
                .version("0.0.1").contact(new Contact("API Support", "https://mymhealth.com", "support@mymhealth.com"))
                .build();
    }
    
    @Bean
    public Docket customImplementation() {

        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors.basePackage("com.springApi.fhir.controllers"))
                .paths(PathSelectors.any()).build().pathMapping("/")
                .directModelSubstitute(java.time.LocalDate.class, java.sql.Date.class)
                .directModelSubstitute(java.time.OffsetDateTime.class, java.util.Date.class).apiInfo(apiInfo());
    }
}