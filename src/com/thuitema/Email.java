package com.thuitema;

import java.util.Random;

public class Email {

    // Fields
    private String firstName;
    private String lastName;
    private String department;
    private String email;
    private String password;
    private int mailboxCap;
    private String altEmail;


    // Non-default Constructor
    public Email(String firstName, String lastName, String department) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.department = department;
        this.email = generateEmail(this.firstName, this.lastName, this.department);
        this.password = generatePassword();
        this.mailboxCap = 500;
        this.altEmail = "N/A";
    }


    // Generate Email
    private String generateEmail(String firstName, String lastName, String department) {
        // I used .toLowerCase here to clean up the parameters, an all lowercase email looks better in my opinion
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department.toLowerCase() + ".company.com";
    }


    // Generate Password
    private String generatePassword() {
        // This video helped me write this method: https://www.youtube.com/watch?v=CZYeTblcOU8

        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890";
        String password = "";
        int length = 8;

        Random rand = new Random();

        char[] text = new char[length]; // Random string is 8 character long

        for (int i = 0; i < length; i++) {
            // Sets a random character to each index of "text"
            text[i] = characters.charAt(rand.nextInt(characters.length()));
        }

        for (int i = 0; i < text.length; i++) {
            // Adds each character from array to password string
            password += text[i];
        }

        return password;
    }


    // toString Method
    public String toString() {
        return "\tFirst Name: " + firstName + "\n" +
                "\tLast Name: " + lastName + "\n" +
                "\tDepartment: " + department + "\n" +
                "\tEmail: " + email + "\n" +
                "\tPassword: " + password + "\n" +
                "\tMailbox Capacity (MB): " + mailboxCap + "\n" +
                "\tAlternate Email: " + altEmail + "\n";
    }


    // Equals Method
    public boolean equals(Email other) {
        return this.firstName.equals(other.firstName) &&
                this.lastName.equals(other.lastName) &&
                this.department.equals(other.department) &&
                this.email.equals(other.email) &&
                this.password.equals(other.password) &&
                this.mailboxCap == other.mailboxCap &&
                this.altEmail.equals(other.altEmail);
    }


    // Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDepartment() {
        return department;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public int getMailboxCap() {
        return mailboxCap;
    }

    public String getAltEmail() {
        return altEmail;
    }


    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMailboxCap(int mailboxCap) {
        this.mailboxCap = mailboxCap;
    }

    public void setAltEmail(String altEmail) {
        this.altEmail = altEmail;
    }
}
