package com.seemantshekhar.design_pattern.Creational.Builder;

public class Application {
    public static void main(String[] args) {
//        Student student = new Student("Diksha", "Goyal", "XII", 21);
//
//        Student student1 = new Student("Shagun", null, "XII", 49);

        //Problem 1: order maintained
        //Problem 2: optional parameter

        Student IkshuIkshu = new  Student.StudentBuilder("Diksha", 21)
                .setLastName("Goyal")
                .setStandard("XII")
                .build();

        StudentSpring studentSpring = StudentSpring.builder()
                .lastName("Goyal")
                .rollNo(21)
                .firstName("Diksha")
                .build();
    }
}
