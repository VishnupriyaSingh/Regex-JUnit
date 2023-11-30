package com.day11;

import java.util.Scanner;

public class Main {

    public static boolean IsValidFirstName(String firstName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return firstName.matches(regex);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = "";
        String lastName = "";
        String email = "";
        String phone = "";
        String password = "";

        boolean stayMain = true;
        boolean staySub = true;
        while (stayMain) {
            System.out.print("Enter first Name: ");
            firstName = scanner.next();
            do {
                if (!IsValidFirstName(firstName)) {
                    System.out.print("Invalid re-enter first Name: ");
                    firstName = scanner.next();
                }
            } while (!IsValidFirstName(firstName));

            stayMain = false;
        }

        System.out.println("Final info ->\n First Name: " + firstName);

        scanner.close();
    }
}