package com.example.demo;

import org.junit.jupiter.api.*;

public class MyTest {

    @BeforeEach
    public void beforeEach(){
        System.out.println("BeforeEach");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("AfterEach");
    }

    @BeforeAll
    public static void beforeAll(){
        System.out.println("BeforeAll");
    }

    @AfterAll
    public static void afterAll(){
        System.out.println("AfterAll");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }
}
