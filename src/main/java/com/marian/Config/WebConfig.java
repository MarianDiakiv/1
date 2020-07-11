package com.marian.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.marian")
public class WebConfig {
    @Bean
    ViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
//@Bean
//public ITemplateResolver iTemplateResolver(){
//    ClassLoaderTemplateResolver resolver = new ClassLoaderTemplateResolver();
//    resolver.setPrefix("WEB-INF/pages/");
//    resolver.setCacheable(false);
//    resolver.setSuffix(".jsp");
//    resolver.setTemplateMode(TemplateMode.HTML);
//    resolver.setCharacterEncoding("UTF-8");
//    return resolver;
//}
}
