package com.mycompany.app;

public class App {

    private static final String MESSAGE = "Hello World!";
    private static final String PASSWORD = "123456"; // ❌ Hardcoded secret

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);

        // ❌ Bad practice: printing sensitive data
        System.out.println("Password: " + PASSWORD);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
