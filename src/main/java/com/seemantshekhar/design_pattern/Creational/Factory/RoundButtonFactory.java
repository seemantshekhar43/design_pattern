package com.seemantshekhar.design_pattern.Creational.Factory;

public class RoundButtonFactory implements ButtonFactory{
    @Override
    public Button create() {
        //library logic
        //value compute
        return new RoundButton();
    }
}
