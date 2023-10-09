package com.seemantshekhar.design_pattern.Creational.Prototype;

public class Student {

    private String firstName;
    private String lastName;
    private int rollNo;
    private String standard;

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", rollNo=" + rollNo +
                ", standard='" + standard + '\'' +
                '}';
    }

    //this
    //super

    private Student(StudentBuilder studentBuilder) {
        firstName = studentBuilder.firstName;
        lastName = studentBuilder.lastName;
        rollNo = studentBuilder.rollNo;
        standard = studentBuilder.standard;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getStandard() {
        return standard;
    }

    public void setStandard(String standard) {
        this.standard = standard;
    }


    public static class StudentBuilder{
        private String firstName;
        private String lastName;
        private int rollNo;
        private String standard;

        public StudentBuilder(String firstName, int rollNo){
            this.firstName = firstName;
            this.rollNo = rollNo;
        }


        public StudentBuilder setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }



        public StudentBuilder setStandard(String standard) {
            this.standard = standard;
            return this;
        }

        public Student build(){
            return new Student(this);
        }
    }
}

