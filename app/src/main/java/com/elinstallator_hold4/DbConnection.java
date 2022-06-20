package com.elinstallator_hold4;

public class DbConnection {

    private static int created = 0;
    private static DbConnection obj = new DbConnection(); //Eager

    private DbConnection() {
    }

    public static DbConnection getInstance() {
        if (created == 0) {
            created = 1;
            return obj;
        }
        return obj;
    }
}
