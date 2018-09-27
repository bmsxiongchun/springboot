package com.xiong.web;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = BlogProperties.class)
public class BlogPropertiesTest {

    @Autowired
    private BlogProperties blogProperties;

    @Test
    public void getBlogProperties() throws Exception {
        Assert.assertEquals(blogProperties.getName(), "Spring Boot Name");
        Assert.assertEquals(blogProperties.getTitle(), "Spring Boot");
    }

}