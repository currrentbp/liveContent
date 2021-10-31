//package com.currentbp;
//
//import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
//import io.swagger.annotations.Api;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Profile;
//import org.springframework.web.context.request.async.DeferredResult;
//import springfox.documentation.builders.ApiInfoBuilder;
//import springfox.documentation.builders.PathSelectors;
//import springfox.documentation.builders.RequestHandlerSelectors;
//import springfox.documentation.service.ApiInfo;
//import springfox.documentation.service.Contact;
//import springfox.documentation.spi.DocumentationType;
//import springfox.documentation.spring.web.plugins.Docket;
//import springfox.documentation.swagger2.annotations.EnableSwagger2;
//
//@Configuration
//@Profile({"staging", "dev", "test"})
//@EnableSwagger2
//@EnableSwaggerBootstrapUI
//public class Swagger {
//    @Bean
//    public Docket cmsApi() {
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("coolplay-message")
//                .genericModelSubstitutes(DeferredResult.class)
//                .useDefaultResponseMessages(false)
//                .forCodeGeneration(true)
//                .pathMapping("/coolplay-message/")
//                .select()
//                .apis(RequestHandlerSelectors.withClassAnnotation(Api.class))
//                .paths(PathSelectors.ant("/*/**"))
//                .build()
//                .apiInfo(defaultApiInfo());
//    }
//
//    private ApiInfo defaultApiInfo() {
//        return new ApiInfoBuilder()
//                .title("Coolplay message RESTFUL API")
//                .version("1.0")
//                .description("潮玩项目运营平台API接口文档")
//                .contact(new Contact("appstore", "http://mi.com", "aphrodite@xiaomi.com"))
//                .build();
//    }
//}
