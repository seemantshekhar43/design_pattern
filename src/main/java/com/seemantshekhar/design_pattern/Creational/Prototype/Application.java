package com.seemantshekhar.design_pattern.Creational.Prototype;


import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {

        Student ikshuIkshu = new Student.StudentBuilder("Diksha", 21)
                .setLastName("Goyal")
                .setStandard("XII")
                .build();

        Student seemoose = new Student.StudentBuilder("Seemant", 48)
                .setLastName("Shekhar")
                .setStandard("XII")
                .build();
        List<Student> studentList = new ArrayList<>();
        studentList.add(ikshuIkshu);
        studentList.add(seemoose);
        Semester semester = new Semester("CSE", "VIII",studentList);

        Semester semester1 = semester.clone();
        semester1.branch = "IX";
        Student rahul = new Student.StudentBuilder("Rahul", 45)
                .setLastName("Verma")
                .setStandard("XII")
                .build();
        semester1.studentList.add(rahul);

        //Reference -- two references pointing to same object in heap
        //Shallow Copy
        //Deep Copy

        System.out.println(semester);
        System.out.println(semester1);
    }
}
