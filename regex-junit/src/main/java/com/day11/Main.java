package com.day11;

import java.util.Scanner;

public class Main {

    public static boolean IsValidFirstName(String firstName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        return firstName.matches(regex);
    }

    public static boolean IsValidLastName(String lastName) {
        String regex = "^[A-Z][a-zA-Z]{2,}$";

        return lastName.matches(regex);
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
        while(stayMain)
        {
            System.out.print("Enter first Name: ");
            firstName = scanner.next();
            do
            {
                if (!IsValidFirstName(firstName))
                {
                    System.out.print("Invalid re-enter first Name: ");
                    firstName = scanner.next();
                }
            }while (!IsValidFirstName(firstName));

            System.out.print("Enter last Name: ");
            lastName = scanner.next();
            do
            {
                if (!IsValidLastName(lastName))
                {
                    System.out.print("Invalid re-enter last Name: ");
                    lastName = scanner.next();
                }
            }while (!IsValidLastName(lastName));

            stayMain = false;
        }

        System.out.println("Final info ->\nFirst Name: " + firstName);
        System.out.println("Last Name: " + lastName);

        scanner.close();
    }
}