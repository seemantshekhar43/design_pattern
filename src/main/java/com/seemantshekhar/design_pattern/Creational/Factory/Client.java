package com.seemantshekhar.design_pattern.Creational.Factory;

public class Client {
    public static void main(String[] args) {
        Application application = new Application(new RoundButtonFactory());
        application.createDialog("Submit");
        application.dismissDialog();

    }
}
