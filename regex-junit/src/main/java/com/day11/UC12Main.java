package com.day11;

import java.util.Scanner;

public class UC12Main {

    public static void IsValidFirstName(String firstName) throws InvalidFirstNameException {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        if (!firstName.matches(regex)) {
            throw new InvalidFirstNameException("Invalid first name.");
        }
    }

    public static void IsValidLastName(String lastName) throws InvalidLastNameException {
        String regex = "^[A-Z][a-zA-Z]{2,}$";
        if (!lastName.matches(regex)) {
            throw new InvalidLastNameException("Invalid last name.");
        }
    }

    public static void IsValidEmail(String email) throws InvalidEmailException {
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9]+(\\.[a-zA-Z]{2,})+";
        if (!email.matches(regex)) {
            throw new InvalidEmailException("Invalid email.");
        }
    }

    public static void IsValidPhoneNo(String phone) throws InvalidPhoneNoException {
        String regex = "^\\+(?:[0-9] ?){6,14}[0-9]$";
        if (!phone.matches(regex)) {
            throw new InvalidPhoneNoException("Invalid phone no.");
        }
    }

    public static void IsValidPassword(String password) throws InvalidPasswordException {
        String regex = "(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=])(?!.*[\\s]).{8,}";
        if (!password.matches(regex)) {
            throw new InvalidPasswordException("Invalid password.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = "";
        String lastName = "";
        String email = "";
        String phone = "";
        String password = "";

        System.out.print("Enter first Name: ");
        firstName = scanner.next();
        try {
            IsValidFirstName(firstName);
        } catch (InvalidFirstNameException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Enter last Name: ");
        lastName = scanner.next();
        try {
            IsValidLastName(lastName);
        } catch (InvalidLastNameException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Enter email: ");
        email = scanner.next();
        try {
            IsValidEmail(email);
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Enter phone no: ");
        phone = scanner.next();
        try {
            IsValidPhoneNo(phone);
        } catch (InvalidPhoneNoException e) {
            System.out.println(e.getMessage());
        }

        System.out.print("Enter password: ");
        password = scanner.next();
        try {
            IsValidPassword(password);
        } catch (InvalidPasswordException e) {
            System.out.println(e.getMessage());
        }
    }
}