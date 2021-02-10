package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            Scanner input =new Scanner(System.in);
            String response;
            do {
                System.out.println("1-Registration\n 2-display");
                int choice = input.nextInt();
                switch (choice) {
                    case 1:
                        System.out.println("Enter your first name");
                        String firstName = input.nextLine();
                        System.out.println("Enter your last name");
                        String lastName = input.nextLine();
                        System.out.println("userType:");
                        type userType=type.student;
                        System.out.println(userType.toString());
                        System.out.println("Enter your email");
                        String email = input.nextLine();
                        System.out.println("Enter your password");
                        String password = input.nextLine();
                        User userInfo=new User(firstName,lastName,userType,email,password);
                        User.register(userInfo);
                        break;
                    case 2:
                        for(int i=0;i<User.display().size();i++) {
                            System.out.println(User.display().get(i).getFirstName());
                            System.out.println(User.display().get(i).getLastName());
                            System.out.println(User.display().get(i).getEmail());
                            System.out.println(User.display().get(i).getPassword());
                        }
                        break;
                }
                System.out.print("DO You want Any Thing (Y/N) : ");
                response=input.next();
            }while(response.equals("y") || response.equals("Y"));
        }
    }

