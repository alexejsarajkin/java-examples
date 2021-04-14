package com.spring.basics.spring;

import com.spring.basics.spring.cdi.SomeCdiBusiness;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringInCdiApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringInCdiApplication.class);

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringInCdiApplication.class)) {
            SomeCdiBusiness business = applicationContext.getBean(SomeCdiBusiness.class);

            LOGGER.info("{} dao-{}", business, business.getSomeCDIDAO());
        }
    }
}