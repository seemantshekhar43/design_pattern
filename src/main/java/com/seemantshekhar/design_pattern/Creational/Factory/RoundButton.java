package com.seemantshekhar.design_pattern.Creational.Factory;

public class RoundButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Round button clicked");
    }

    @Override
    public String  view() {
        return "This is a round button!";
    }
}
