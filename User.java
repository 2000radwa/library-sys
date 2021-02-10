package com.company;

import java.util.ArrayList;
import java.util.List;
enum type{admin,student}
public class User {

    private static List<User> userList = new ArrayList<>();
    private String firstName;
    private String lastName;
    private type userType;
    private String email;
    private String password;



    public User(String firstName, String lastName,type userType, String email, String password){
        if(IsDataValid(firstName)&&IsDataValid(lastName)&&IsDataValid(email)&&IsDataValid(password)){
        this.firstName=firstName;
        this.lastName = lastName;
        this.userType=userType;
        this.email = email;
        this.password = password;

        }
    }
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }


    private boolean IsDataValid(String letter){
        if(letter==null||letter.isEmpty()){
            return false;
        }
        else {return true;}
    }

    public static void register(User userInf){
        userList.add(userInf);
    }
    public static List<User> display() {
return userList;}}
