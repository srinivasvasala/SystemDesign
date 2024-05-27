package Singleton;

public class Runner {
    public static void main(String[] args) {
        ConnectionPool connectionPool1 = ConnectionPool.getInstance();
        ConnectionPool connectionPool2 = ConnectionPool.getInstance();
        System.out.println(connectionPool2==connectionPool1);
    }
}
