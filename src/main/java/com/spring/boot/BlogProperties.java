package com.spring.boot;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by zhoukaili on 17/2/20.
 */
@ConfigurationProperties
@Component
public class BlogProperties {
    @Value("${com.didispace.blog.name}")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Value("${com.didispace.blog.title}")
    private String title;
    // 省略getter和setter
}
