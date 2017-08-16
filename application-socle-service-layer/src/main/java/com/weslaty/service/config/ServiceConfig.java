package com.weslaty.service.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.weslaty.service") //is equivalent to context:component-scan base-package="..." providing with where to look for spring managed beans/classes.
public class ServiceConfig {
}
