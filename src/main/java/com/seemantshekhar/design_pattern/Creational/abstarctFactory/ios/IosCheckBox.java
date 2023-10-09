package com.seemantshekhar.design_pattern.Creational.abstarctFactory.ios;

import com.seemantshekhar.design_pattern.Creational.abstarctFactory.CheckBox;

public class IosCheckBox implements CheckBox {
    @Override
    public void view() {
        System.out.println("This is iOS CheckBox!");
    }
}
