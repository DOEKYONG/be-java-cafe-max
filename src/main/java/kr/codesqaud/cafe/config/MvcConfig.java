package kr.codesqaud.cafe.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.setOrder(Ordered.HIGHEST_PRECEDENCE);
//        registry.addViewController("/user/signup").setViewName("user/form");
//        registry.addViewController("/users/login").setViewName("user/login");
//        registry.addViewController("/article/question").setViewName("qna/form");
        registry.addViewController("/user/login").setViewName("user/login");

    }
}
