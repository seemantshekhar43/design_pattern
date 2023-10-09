package com.seemantshekhar.design_pattern.Creational.Factory;

public class Application {

    Button button;

    public Application(ButtonFactory factory){
        this.button = factory.create();
    }

    void createDialog(String text){
        System.out.println(button.view() + "with label as: " + text);
    }

    void dismissDialog(){
        button.onClick();
    }


}
