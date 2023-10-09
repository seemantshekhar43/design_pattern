package com.seemantshekhar.design_pattern;

public class Application {
    DBServer dbServer;

    public Application(DBServer dbServer) {
        this.dbServer = dbServer;
    }

    public  Object fetchObject(String id){
        return dbServer.read(id);

    }


}
