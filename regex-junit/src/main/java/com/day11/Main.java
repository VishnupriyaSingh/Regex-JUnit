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

    public static boolean IsValidEmail(String email) {
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+";

        return email.matches(regex);
    }

    public static boolean IsValidPhoneNo(String password) {
        String regex = "^\\+(?:[0-9] ?){6,14}[0-9]$";

        return password.matches(regex);
    }

    public static boolean IsValidPassWordR2(String password) {
        String regex = "(?=.*[A-Z]).{8,}";

        return password.matches(regex);
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

            System.out.print("Enter email: ");
            email = scanner.next();
            do
            {
                if (!IsValidEmail(email))
                {
                    System.out.print("Invalid re-enter email: ");
                    email = scanner.next();
                }
            }while (!IsValidEmail(email));

            System.out.print("Enter phone no: ");
            phone = scanner.next();
            do
            {
                if (!IsValidPhoneNo(phone))
                {
                    System.out.print("Invalid re-enter phone no: ");
                    phone = scanner.next();
                }
            }while (!IsValidPhoneNo(phone));

            System.out.print("Enter password: ");
            password = scanner.next();
            do
            {
                if (!IsValidPassWordR2(password))
                {
                    System.out.print("Invalid re-enter password: ");
                    password = scanner.next();
                }
            }while (!IsValidPassWordR2(password));
            stayMain = false;
        }

        System.out.println("Final info ->\nFirst Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Email: " + email);
        System.out.println("Phone No: " + phone);
        System.out.println("Password: " + password);

        scanner.close();
    }
}