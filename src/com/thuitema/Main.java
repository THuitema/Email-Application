package com.thuitema;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Employee Email Application!\n");
        Email email = createEmail(scanner);

        System.out.println("Here are the details for the new email: ");
        System.out.println(email);

        runMenu(scanner, email);

    }

    public static Email createEmail(Scanner scanner) {
        System.out.println("Please follow the prompts to create an email:");

        // Prompts to create new Email object
        System.out.print("\tEnter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("\tEnter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("\tEnter department: ");
        String department = scanner.nextLine();
        System.out.println();

        return new Email(firstName, lastName, department);
    }

    public static void runMenu(Scanner scanner, Email email) {
        // Keeps repeating until user enters 0, which breaks the loop, ending the program
        while(true) {
            System.out.println("Here are your options: ");
            System.out.println("\t[0] EXIT");
            System.out.println("\t[1] View details");
            System.out.println("\t[2] Change details");

            System.out.print("Enter an option: ");
            int option = scanner.nextInt();

            if(option == 0) {
                break;
            }

            else if(option == 1) {
                System.out.println(email);
            }

            else if(option == 2) {
                while(true) {
                    System.out.println("\tWhich detail would you like to change? ");
                    System.out.println("\t\t[0] Back to main menu");
                    System.out.println("\t\t[1] First Name");
                    System.out.println("\t\t[2] Last Name");
                    System.out.println("\t\t[3] Department");
                    System.out.println("\t\t[4] Email");
                    System.out.println("\t\t[5] Password");
                    System.out.println("\t\t[6] Mailbox Capacity");
                    System.out.println("\t\t[7] Alternate Email");

                    System.out.print("Enter an option: ");
                    option = scanner.nextInt();

                    if(option == 0) {
                        break; // Ends this loop, goes back to main loop
                    }

                    else if(option == 1) {
                        System.out.print("\tWhat would you like to set \"First Name\" to? ");
                        email.setFirstName(scanner.next());
                        System.out.println("\t\"First Name\" has been set to \"" + email.getFirstName() + "\"\n");
                    }

                    else if(option == 2) {
                        System.out.print("\tWhat would you like to set \"Last Name\" to? ");
                        email.setLastName(scanner.next());
                        System.out.println("\t\"Last Name\" has been set to \"" + email.getLastName() + "\"\n");
                    }

                    else if(option == 3) {
                        System.out.print("\tWhat would you like to set \"Department\" to? ");
                        email.setDepartment(scanner.next());
                        System.out.println("\t\"Department\" has been set to \"" + email.getDepartment() + "\"\n");
                    }

                    else if(option == 4) {
                        System.out.print("\tWhat would you like to set \"Email\" to? ");
                        email.setEmail(scanner.next());
                        System.out.println("\t\"Email\" has been set to \"" + email.getEmail() + "\"\n");
                    }

                    else if(option == 5) {
                        System.out.print("\tWhat would you like to set \"Password\" to? ");
                        email.setPassword(scanner.next());
                        System.out.println("\t\"First Name\" has been set to \"" + email.getPassword() + "\"\n");
                    }

                    else if(option == 6) {
                        System.out.print("\tWhat would you like to set \"Mailbox Capacity\" to? ");
                        email.setMailboxCap(scanner.nextInt());
                        System.out.println("\t\"Mailbox Capacity\" has been set to \"" + email.getMailboxCap() + "\"\n");
                    }

                    else if(option == 7) {
                        System.out.print("\tWhat would you like to set \"Alternate Email\" to? ");
                        email.setAltEmail(scanner.next());
                        System.out.println("\t\"First Name\" has been set to \"" + email.getAltEmail() + "\"\n");
                    }

                    else {
                        System.out.println("Hm... I don't understand your input, try typing something else.");
                    }
                }
            }

            else {
                System.out.println("Hm... I don't understand your input, try typing something else.");
            }
        }
    }
}
