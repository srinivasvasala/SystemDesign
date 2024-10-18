package Singleton;

//public class singleton_practice {
//    private static singleton_practice instance;
//    private singleton_practice() {
//
//    }
//    public static synchronized singleton_practice getInstance() {
//        if (instance == null) {
//            instance = new singleton_practice();
//        }
//        return instance;
//    }
//}
public class singleton_practice {
    private  singleton_practice(){

    }
    private static class singleton_Helper{
        private static final singleton_practice instance = new singleton_practice();
    }
    public static singleton_practice getInstance(){
        return singleton_Helper.instance;
    }

}


