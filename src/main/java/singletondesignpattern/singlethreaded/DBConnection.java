package singletondesignpattern.singlethreaded;

public class DBConnection {
    private String url;
    private String username;
    private String password;

    private static DBConnection dbConnection;

    private DBConnection(){};// private constructor because we can't create object , we don't want to create multiple objects in singleton

    public static DBConnection createInstance()// we created this method to we don't have object of DBConnection class so we are making the static method
    {
        if(dbConnection==null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

}
