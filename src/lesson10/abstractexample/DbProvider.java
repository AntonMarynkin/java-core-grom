package lesson10.abstractexample;

public abstract class DbProvider {

    private String dbHost;

    // можно создавать конструкторы
    /*public DbProvider(String dbHost) {
        this.dbHost = dbHost;
    }*/

    abstract void connectToDb();

    abstract void disconnectFromDb();

    void printDbHost() {
        System.out.println("DB host is" + dbHost);
    }
}
