package com.now.config;

import com.now.aspect.Audience;
import com.now.inter.Performance;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@Component
@EnableAspectJAutoProxy  //启用AspectJ自动代理
public class AOPConfig {

    @Bean
    public Audience audience(){
        return new Audience();
    }

    @Bean
    public Performance performance(){
        return new Performance();
    }
}
