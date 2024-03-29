package singletondesignpattern.singlethreaded;

public class DBConnection {
    private String url;
    private String username;
    private String password;

    private static DBConnection dbConnection;

    private DBConnection(){};

    public static DBConnection createInstace()
    {
        if(dbConnection==null) {
            dbConnection = new DBConnection();
        }
        return dbConnection;
    }

}
