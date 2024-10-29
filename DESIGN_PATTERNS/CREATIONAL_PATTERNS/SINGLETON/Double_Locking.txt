package DESIGN_PATTERNS.CREATIONAL_PATTERNS.SINGLETON;

class DBConnection {
    private static DBConnection connectionObject;

    private DBConnection() {

    }

    public static DBConnection getInstance() {
        if (connectionObject == null) {
            synchronized (DBConnection.class) {
                if (connectionObject == null){
                    connectionObject = new DBConnection();
                }    
            }
        }
        return connectionObject;
    }
}

public class Double_Locking {
    public static void main(String[] args) {
        DBConnection.getInstance();
    }
}
