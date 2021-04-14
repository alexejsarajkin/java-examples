package com.spring.basics.spring;

import com.spring.basics.spring.basic.BinarySearchImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class SpringInBasicApplication {

    public static void main(String[] args) {

        try (AnnotationConfigApplicationContext applicationContext =
                     new AnnotationConfigApplicationContext(
                             SpringInBasicApplication.class)) {

            BinarySearchImpl binarySearch =
                    applicationContext.getBean(BinarySearchImpl.class);

            BinarySearchImpl binarySearch1 =
                    applicationContext.getBean(BinarySearchImpl.class);

            System.out.println(binarySearch);
            System.out.println(binarySearch1);

            int result = binarySearch.binarySearch(new int[]{12, 4, 6}, 3);
            System.out.println(result);
        }
    }
}