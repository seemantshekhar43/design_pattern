package com.seemantshekhar.design_pattern.Creational.abstarctFactory.android;

import com.seemantshekhar.design_pattern.Creational.abstarctFactory.Button;

public class AndroidButton implements Button {
    @Override
    public void view() {
        System.out.println("This is Android Button!");
    }


}
