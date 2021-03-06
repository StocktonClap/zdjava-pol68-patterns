package singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Menu menu = Menu.INSTANCE;
        menu.print();
    }
}
