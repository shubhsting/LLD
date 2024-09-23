package DESIGN_PATTERNS.CREATIONAL_PATTERNS.SINGLETON;

class DBConnection {
    private static DBConnection connectionObject = new DBConnection();

    private DBConnection() {

    }

    public static DBConnection getInstance() {
        return connectionObject;
    }
}

public class Eager_Initialisation {
    public static void main(String[] args) {
        DBConnection connection = DBConnection.getInstance();
    }
}
