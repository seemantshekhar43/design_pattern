package com.seemantshekhar.design_pattern.Creational.abstarctFactory.android;

import com.seemantshekhar.design_pattern.Creational.abstarctFactory.CheckBox;

public class AndroidCheckBox implements CheckBox {
    @Override
    public void view() {
        System.out.println("This is Android CheckBox!");
    }
}
