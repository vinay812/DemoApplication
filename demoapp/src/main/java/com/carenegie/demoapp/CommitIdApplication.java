package com.carenegie.demoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication(scanBasePackages = { "com.carenegie.demoapp" })
public class CommitIdApplication {

    public static void main(String[] args) {
        SpringApplication.run(CommitIdApplication.class, args);
    }

  /*  @Bean
    public static PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        PropertySourcesPlaceholderConfigurer propsConfig
                = new PropertySourcesPlaceholderConfigurer();
        propsConfig.setLocation(new ClassPathResource("demoapp/src/main/resources/git.properties"));
        propsConfig.setIgnoreResourceNotFound(true);
        propsConfig.setIgnoreUnresolvablePlaceholders(true);
        return propsConfig;
    }*/
}
