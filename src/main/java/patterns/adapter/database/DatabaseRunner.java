package patterns.adapter.database;

public class DatabaseRunner {
    public static void main(String[] args) {
        Database database = new AdapterJavaAppToDatabase();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}
