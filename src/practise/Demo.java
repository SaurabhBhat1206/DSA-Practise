package practise;

final public class Demo {

    public Demo() {
        for (int i = 1; i < 20; i++) {
            System.out.println("Demo() constructor called method " + i);
        }
    }

    public void f1() {
        for (int i = 1; i < 20; i++) {
            System.out.println("f1() method " + i);
        }
    }

    public static void f2() {
        for (int i = 1; i < 20; i++) {
            System.out.println("f2() method " + i);
        }
    }
}


