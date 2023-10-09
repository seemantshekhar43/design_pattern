package com.seemantshekhar.design_pattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) {
//        SpringApplication.run(DesignPatternApplication.class, args);
//
//        DBServer dbServer = new DikshaDB();
//        DBServer dbServer1 = new KuchikuDB();
//
//        Application application = new Application(dbServer1);
//`

//        System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));
//
//        DikshaDB db = new DikshaDB();
//        DikshaDB db1 = new DikshaDB();
//        System.out.println(DikshaDB.id);
//        DikshaDB.id = 6;
//        System.out.println(DikshaDB.id);
//        User user = new


        Application application = new Application(new DikshaDB());
        System.out.println(application.fetchObject("34"));



    }

}


/*
* Object oriented programming
* - Inheritance - extend keyword
* - Abstraction - interface / abstract class
* - Encapsulation - private keyword
* - Polymorphism - override/ overload method
*
* SOLID ->
* S -> Single Responsibility
* O -> Open for extension but closed for modification
* L -> Liskov substitution
* I -> Interface Segregation
* D -> Dependency Inversion
*
* */
