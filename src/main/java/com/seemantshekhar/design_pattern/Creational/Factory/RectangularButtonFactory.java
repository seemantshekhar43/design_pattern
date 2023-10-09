package com.seemantshekhar.design_pattern.Creational.Factory;

public class RectangularButtonFactory implements ButtonFactory{
    @Override
    public Button create() {
        return new RectangularButton();
    }
}
