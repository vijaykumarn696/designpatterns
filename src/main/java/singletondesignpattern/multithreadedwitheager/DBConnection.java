package singletondesignpattern.multithreadedwitheager;

public class DBConnection {
    // attributes

    private static DBConnection dbConnection=new DBConnection();// Eager loading

    private DBConnection(){}

    public static DBConnection createInstance()
    {
        return dbConnection;
    }
}
