package com.backend.theartcafebackend.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.swagger2.annotations.EnableSwagger2WebFlux;

import static springfox.documentation.builders.PathSelectors.regex;

@Configuration
@EnableSwagger2WebFlux
public class AppConfig implements WebFluxConfigurer {
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .enable(true)
                //.genericModelSubstitutes(Mono.class, Flux.class, Publisher.class)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.backend.theartcafebackend.controller"))
                .paths(regex("/api.*"))
                .build().apiInfo(apiInfo());
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder().title("Reactive Stream Starter Demo")
                .description("Reactive Stream Starter Demo")
                .version("1.0").build();
    }
}
