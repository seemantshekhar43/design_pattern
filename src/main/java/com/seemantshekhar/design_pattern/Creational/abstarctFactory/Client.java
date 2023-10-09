package com.seemantshekhar.design_pattern.Creational.abstarctFactory;

public class Client {
    public static void main(String[] args) {

        PlatformFactory platformFactory = null;

        System.setProperty("platform", "ios");

        if(System.getProperty("platform").toString().equals("Android")){
            platformFactory = new AndroidFactory();
        }else{
            platformFactory = new IosFactory();
        }

        Application application = new Application(platformFactory);
        application.showButton();
        application.showCheckBox();
    }
}
