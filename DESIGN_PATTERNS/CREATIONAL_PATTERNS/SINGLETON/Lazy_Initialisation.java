package DESIGN_PATTERNS.CREATIONAL_PATTERNS.SINGLETON;

class DBConnection {
    private static DBConnection connectionObject;

    private DBConnection() {

    }

    public static DBConnection getInstance() {
        if (connectionObject == null) {
            connectionObject = new DBConnection();
        }
        
        return connectionObject;
    }
}

public class Lazy_Initialisation {
    public static void main(String[] args) {
        DBConnection connection = DBConnection.getInstance();
    }
}