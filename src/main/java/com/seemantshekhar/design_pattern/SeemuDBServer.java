package com.seemantshekhar.design_pattern;

public class SeemuDBServer extends DBServerAbstractClass{
    @Override
    Object create(Object object) {
        return null;
    }

    @Override
    Object read(String id) {
        return null;
    }

    @Override
    Object update(Object object) {
        return null;
    }

    @Override
    Object delete(Object object) {
        return null;
    }

    public Long abs(Long l){
        return  -1* l;
    }

    public Integer abs(int i){
        Math.abs(5);
        return  -1* i;

        // static keyword -> belongs to class -> runtime pr aa jata hai
    }


}
