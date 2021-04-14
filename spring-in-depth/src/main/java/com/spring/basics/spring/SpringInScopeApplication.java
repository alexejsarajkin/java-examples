package com.spring.basics.spring;

import com.spring.basics.spring.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringInScopeApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringInScopeApplication.class);

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringInScopeApplication.class)) {

            PersonDAO personDao = applicationContext.getBean(PersonDAO.class);

            PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);

            LOGGER.info("{}", personDao);
            LOGGER.info("{}", personDao.getJdbcConnection());
            LOGGER.info("{}", personDao.getJdbcConnection());

            LOGGER.info("{}", personDao2);
            LOGGER.info("{}", personDao.getJdbcConnection());
        }
    }
}