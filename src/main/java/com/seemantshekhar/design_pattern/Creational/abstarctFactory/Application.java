package com.seemantshekhar.design_pattern.Creational.abstarctFactory;

public class Application {
    Button button;
    CheckBox checkBox;

    public Application(PlatformFactory platformFactory){
        button = platformFactory.createButton();
        checkBox = platformFactory.createCheckBox();
    }

    void showButton(){
        button.view();
    }

    void showCheckBox(){
        checkBox.view();
    }
}
