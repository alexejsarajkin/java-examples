package com.spring.basics.spring.basic;

import com.spring.basics.spring.SpringInBasicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

//Load the context
@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringInBasicApplication.class)
public class BinarySearchTest {

    // Get this bean from the context
    @Autowired
    BinarySearchImpl binarySearch;

    @Test
    public void testBasicScenario() {

        // call method on binarySearch
        int actualResult = binarySearch.binarySearch(new int[]{}, 5);

        // check if the value is correct
        assertEquals(3, actualResult);

    }

}
