package com.seemantshekhar.design_pattern.Creational.abstarctFactory.ios;

import com.seemantshekhar.design_pattern.Creational.abstarctFactory.Button;

public class IosButton implements Button {
    @Override
    public void view() {
        System.out.println("This is iOS Button!");
    }
}
