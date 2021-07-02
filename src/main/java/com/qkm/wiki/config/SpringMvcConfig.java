package com.qkm.wiki.config;

import com.qkm.wiki.interceptor.ActionInterceptor;
import com.qkm.wiki.interceptor.LoginInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.Resource;

@Configuration
public class SpringMvcConfig implements WebMvcConfigurer {

    @Resource
    LoginInterceptor loginInterceptor;

    @Resource
    ActionInterceptor actionInterceptor;

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(loginInterceptor)
                .addPathPatterns("/**")
                .excludePathPatterns(
                        "/test/**",
                        "/redis/**",
                        "/user/login",
                        "/user/save",
                        "/category/all",
                        "/taskcategory/all",
                        "/ebook/list",
                        "/task/list",
                        "/comment/**",
                        "/score/list",
                        "/TaskResult/**",
                        "/score/find/**",
                        "/doc/all/**",
                        "/doc/vote/**",
                        "/doc/list/**",
                        "/doc/find-content/**",
                        "/score/findname/**",
                        "/ebook-snapshot/**",
                        "/scorend/**",
                        "/ability/**",
                        "/useradmin/**",
                        "/training/**",
                        "/courseplan/**",
                        "/zhuanlan/**",
                        "/zl/**",
                        "/zlcat1/**",
                        "/zlcat2/**",
                        "/zlcat3/**",
                        "/acticle/**",
                        "/upload/**"
                );

//        registry.addInterceptor(actionInterceptor)
//                .addPathPatterns(
//                        "/*/save",
//                        "/*/delete/**",
//                        "/*/reset-password");
    }
}
