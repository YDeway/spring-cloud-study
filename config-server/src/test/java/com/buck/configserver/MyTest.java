package com.buck.configserver;

public class MyTest {

    {
        System.out.println(1111);
    }
    public static void main(String[] args) {
        new MyTest();
    }

    MyTest () {

        this(5);
        System.out.println(555);
    }

    MyTest(int i) {
        System.out.println(3);
    }
}
