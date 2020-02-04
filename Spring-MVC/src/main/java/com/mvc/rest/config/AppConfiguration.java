package com.mvc.rest.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;


@Configuration
@ComponentScan(basePackages = {"com.mvc"})
@Import({MvcConfiguration.class})
public class AppConfiguration {
}
