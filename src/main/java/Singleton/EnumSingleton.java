package Singleton;

public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
        System.out.println("EnumSingleton is doing something");
    }
    public static void main(String[] args) {
        EnumSingleton.INSTANCE.doSomething();
    }
}
