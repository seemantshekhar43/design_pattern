package com.seemantshekhar.design_pattern.Creational.Factory;

public class RectangularButton implements Button{
    @Override
    public void onClick() {
        System.out.println("Rectangular button clicked");
    }

    @Override
    public String view() {
        return "This is a rectangular button!";
    }
}
