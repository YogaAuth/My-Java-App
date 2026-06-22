package com.myapp;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello from DevOps Pipeline!");
        System.out.println("Git -> Jenkins -> Maven -> Docker -> AWS");
    }

    public static String getMessage() {
        return "Hello DevOps!";
    }
}