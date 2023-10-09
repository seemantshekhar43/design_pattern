package com.seemantshekhar.design_pattern;

public class User {

    String name;
    int age;
    String userName;
    String profileImageLink;
    String status;

    public User(String name, int age, String userName, String profileImageLink, String status) {
        this.name = name;
        this.age = age;
        this.userName = userName;
        this.profileImageLink = profileImageLink;
        this.status = status;
    }

    public  void setAge(String dob){
        // converts dob to age
        this.age = 10;
    }

    public  void updateStatus(String status){
        // converts dob to age
        this.status = status;
    }

//    public int transferMoney(User a, User b, int amount){
//
//    }
}
