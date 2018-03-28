package org.hhw.study.restonspringwebmvc.config;

import org.hhw.study.restonspringwebmvc.httpmessage.PersonProperties2HttpMessageConverter;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;

/**
 * Created by houhongwei on 2018/3/26.
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
        //增加对象解析器
        converters.add(new PersonProperties2HttpMessageConverter());
        System.err.println("converters:" + converters);
    }
}
