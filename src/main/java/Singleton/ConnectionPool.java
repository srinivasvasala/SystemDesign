package Singleton;

import com.sun.source.tree.SynchronizedTree;

public class ConnectionPool {

    //step3 add a static local field
     private static ConnectionPool INSTANCE = null;
    //Step1 protect
    private ConnectionPool(){}
    //step2 global access point
    public static  ConnectionPool getInstance(){
        if (INSTANCE == null){
            synchronized (INSTANCE){
                if (INSTANCE == null) {
                    INSTANCE = new ConnectionPool();
                }
            }
        }
       return INSTANCE;
    }
}
