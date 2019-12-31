//package com.example.mallmanager.configs;
//
//import org.springframework.beans.factory.annotation.Configurable;
//import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
//import org.springframework.boot.web.server.ConfigurableWebServerFactory;
//import org.springframework.boot.web.server.ErrorPage;
//import org.springframework.boot.web.server.WebServerFactory;
//import org.springframework.boot.web.server.WebServerFactoryCustomizer;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpStatus;
//
//import java.util.Set;
//
///**
// * @Author: zhengXiangBo
// * @Date: 2019/12/30
// * @Description:
// */
//@Configuration
//public class ErrorConfig {
//
//
//    @Bean
//    public WebServerFactoryCustomizer<ConfigurableWebServerFactory> webServerFactoryCustomizer(){
//        return factory -> {
//            ErrorPage errorPage1=new ErrorPage(HttpStatus.UNAUTHORIZED,"/error/401.html");
//            ErrorPage errorPage2=new ErrorPage(HttpStatus.NOT_FOUND,"/error/404.html");
//            ErrorPage errorPage3=new ErrorPage(HttpStatus.INTERNAL_SERVER_ERROR,"/error/500.html");
//
//            factory.addErrorPages(errorPage1,errorPage2,errorPage3);
//        };
//    }
//}
