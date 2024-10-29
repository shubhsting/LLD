package DESIGN_PATTERNS.CREATIONAL_PATTERNS.SINGLETON;

class DBConnection {
    private static DBConnection connectionObject;

    private DBConnection() {

    }

    synchronized public static DBConnection getInstance() {
        if (connectionObject == null) {
            connectionObject = new DBConnection();
        }
        return connectionObject;
    }
}

public class Synchronized_Method {
    public static void main(String[] args) {
        DBConnection connection = DBConnection.getInstance();
    }
}
