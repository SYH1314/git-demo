package com.learn.git.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoApplication {

    public static void main(String[] args) {
        System.out.println("hello");
        System.out.println("hello2");
        System.out.println("hello3");
        System.out.println("master test");
        SpringApplication.run(GitDemoApplication.class, args);
    }

}
