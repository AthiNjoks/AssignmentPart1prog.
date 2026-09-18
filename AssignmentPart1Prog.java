/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.assignmentpart1prog;

/**
 *
 * @author thokozile
 */
import java.util.Scanner;
public class AssignmentPart1Prog {
public static void 
        main(String[] args) {
Scanner scanner = new 
        Scanner(System.in);
System.out.println("=== Registration ===");
System.out.print("Enter first name: ");
String firstName = scanner.nextLine();
System.out.print("Enter last name: ");
String lastName = scanner.nextLine();
System.out.print("Enter username: ");
String username = scanner.nextLine();
System.out.print("Enter password: ");
String password = scanner.nextLine();

System.out.print("Enter cell phone number: ");
String cellPhoneNumber = 
        scanner.nextLine();

Loginuser = new Login(
firstName,
lastName,
username,
password,
cellPhoneNumber
);
System.out.println(user.registerUser());
System.out.println("\n=== Login ===");
System.out.print("Enter username to login: ");
String enteredUsername = scanner.nextLine();
System.out.print("Enter password to login: ");
String enteredPassword = scanner.nextLine();
boolean
        loginStatus =
        user.loginUser(
enteredUsername,
enteredPassword
);
System.out.println(user.returnLoginStatus(loginStatus));
scanner.close();
}
}