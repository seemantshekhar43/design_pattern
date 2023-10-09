package com.seemantshekhar.design_pattern.Creational.Prototype;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Semester implements Cloneable{

    String branch;
    String id;
    List<Student> studentList;

    public Semester(String branch, String id, List<Student> studentList) {
        this.branch = branch;
        this.id = id;
        this.studentList = studentList;
    }

    public Semester clone(){
        return new Semester(this.branch, this.id, new ArrayList<>(studentList));
    }

    @Override
    public String toString() {
        return "Semester{" +
                "hashCode='" + this.hashCode() + '\'' +
                "branch='" + branch + '\'' +
                ", id='" + id + '\'' +
                ", studentList=" + Arrays.toString(studentList.toArray())+
                '}';
    }
}
