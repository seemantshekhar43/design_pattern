package com.seemantshekhar.design_pattern;

public interface BadInterface {

    Object createDBConnection();

    Object openFile();

    Object create(Object object);

    Object read(String id);

    Object update(Object object);

    Object delete(Object object);
}
