package com.spring.basics.spring;

import com.spring.basics.spring.xml.XmlPersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringInXMLContextApplication {

    private static Logger LOGGER = LoggerFactory.getLogger(SpringInScopeApplication.class);

    public static void main(String[] args) {

        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml")) {

            LOGGER.info("Beans Loaded -> {}", (Object) applicationContext.getBeanDefinitionNames());

            XmlPersonDAO personDao = applicationContext.getBean(XmlPersonDAO.class);

            LOGGER.info("{} {}", personDao, personDao.getXmlJdbcConnection());
        }
    }
}