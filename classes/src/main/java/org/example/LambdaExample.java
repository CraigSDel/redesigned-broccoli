package org.example;

public class LambdaExample {

    public static void main(String[] args) {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("In another thread");
            }
        });
        th.start();

        Thread th1 = new Thread(() -> System.out.println("In another thread"));
        th1.start();

        System.out.println("In main");
    }
}
