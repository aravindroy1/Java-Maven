// package com.mycompany.app;

// public class App {

//     private static final String MESSAGE = "Hello World!";
//     private static final String PASSWORD = "123456"; // ❌ Hardcoded secret

//     public static void main(String[] args) {
//         System.out.println(MESSAGE);
 
//         // ❌ security issue (but valid Java)
//         if (PASSWORD.equals("123456")) {
//             System.out.println("Weak password");
//         }
//     }

//     public String getMessage() {
//         return MESSAGE;
//     }
// }

package com.mycompany.app;

/**
 * Hello world!
 */
public class App {

    private static final String MESSAGE = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(MESSAGE);
    }

    public String getMessage() {
        return MESSAGE;
    }
}
