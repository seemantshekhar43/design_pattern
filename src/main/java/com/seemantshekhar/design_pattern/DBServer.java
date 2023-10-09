package com.seemantshekhar.design_pattern;

public interface DBServer {
    //crud operations
    Object create(Object object);

    Object read(String id);

    Object update(Object object);

    Object delete(Object object);


}