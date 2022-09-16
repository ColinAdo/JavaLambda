package thread;

public class Main {
    public static void main(String[] args) {
//        without lambda
        Runnable st = new Runnable() {
            @Override
            public void run() {

                System.out.println("thread one is running");
            }
        };
        Thread one = new Thread(st);
        one.start();
//        with lambda
        Runnable string = () -> System.out.println("thread two is running");
        Thread two = new Thread(string);
        two.start();

    }
}
