package com.seemantshekhar.design_pattern;

public abstract class DBServerAbstractClass {

    abstract Object create(Object object);

    abstract Object read(String id);

    abstract Object update(Object object);

    abstract Object delete(Object object);

    public int getNextID(){
        return 0;
    }
}
