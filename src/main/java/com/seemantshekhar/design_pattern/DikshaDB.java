package com.seemantshekhar.design_pattern;

public class DikshaDB implements DBServer{

    public  static int id = 5;
    @Override
    public Object create(Object object) {
        System.out.println("Object created");

        return object;
    }

    @Override
    public Object read(String id) {
        return null;
    }

    @Override
    public Object update(Object object) {
        return null;
    }

    @Override
    public Object delete(Object object) {
        return null;
    }
}
