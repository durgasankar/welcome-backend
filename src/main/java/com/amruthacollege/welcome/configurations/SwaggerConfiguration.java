package com.amruthacollege.welcome.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger is a set of open-source tools built around the OpenAPI Specification
 * that can help you design, build, document and consume REST APIs. ... Swagger
 * UI – renders OpenAPI specks as interactive API documentation.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfiguration {

    @Bean
    public Docket docket() {
        return new Docket (DocumentationType.SWAGGER_2)
                .select ()
                .apis (RequestHandlerSelectors.basePackage ("com.amruthacollege.welcome.controllers"))
                .build ();
    }

}