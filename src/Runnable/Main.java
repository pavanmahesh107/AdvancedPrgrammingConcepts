package Runnable;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Pavan Mahesh Printed by: "+Thread.currentThread().getName());

        Runnable runnable = () -> System.out.println("Hello Pavan Mahesh Printed by: "+Thread.currentThread().getName());
        Thread thread = new Thread(runnable);
        thread.start();

        Thread thread1 = new Thread(
                () -> System.out.println("Hello Pavan Mahesh Printed by: "+Thread.currentThread().getName())
                );
        thread1.start();
    }

}
