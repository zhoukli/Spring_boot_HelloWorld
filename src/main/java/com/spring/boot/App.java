package com.spring.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

/**
 * Created by zhoukaili on 17/2/20.
 */
@SpringBootApplication
@EnableConfigurationProperties({BlogProperties.class})

public class App {

    public static  void  main(String [] args) throws  Exception{
        SpringApplication.run(App.class,args) ;
    }

    /**
     * Created by zhoukaili on 17/2/20.
     */
    @ConfigurationProperties(prefix = "wisely2")
    public static class Wisely2Settings {
        private String name;
        private String gender;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }

    }

    /**
     * Created by zhoukaili on 17/2/20.
     */
    @ConfigurationProperties(prefix = "wisely",locations = "classpath:wisely.properties")
    public static class WiselySettings {
        private String name;
        private String gender;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }

    }
}
