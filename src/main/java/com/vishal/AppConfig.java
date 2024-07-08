package com.vishal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public CakeBaker getCakeBaker()
    {
        return new CakeBaker();
    }
}
