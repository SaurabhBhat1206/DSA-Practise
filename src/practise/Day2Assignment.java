package practise;

public class Day2Assignment{
    public static void main(String[] args) {
        Demo demo = new Demo();
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                demo.f1();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Demo.f2();
            }
        });
        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                Demo demo = new Demo();
            }
        });

        t1.start();
        t2.start();
    }
}
