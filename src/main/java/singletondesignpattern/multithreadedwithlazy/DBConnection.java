package singletondesignpattern.multithreadedwithlazy;

public class DBConnection {

    // attributes
    private static DBConnection dbConnection;

    private DBConnection(){};
    public static DBConnection createInstance()
    {
        // Double check locking
        if(dbConnection==null)
        {
            synchronized (DBConnection.class) {
                if(dbConnection==null) {
                    dbConnection = new DBConnection();
                }
            }
        }
        return dbConnection;
    }
}
