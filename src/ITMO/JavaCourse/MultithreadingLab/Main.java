package ITMO.JavaCourse.MultithreadingLab;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //First and second Task
        System.out.println("Первое и второе задания");
        for (int i=0; i<=10; i++) {
            TenThreads thread = new TenThreads();
            //State before threads start
            System.out.println(thread.getState());
            thread.start();
            //State during operation
            System.out.println(thread.getState());
            //State after operation
            try {
                thread.join();
                System.out.println(thread.getState());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }

        //Third Task
        System.out.println("\n" + "Третье задание");
        Counter counter = new Counter();
        CountDownLatch latch = new CountDownLatch(100);
        List<Thread> threads = new ArrayList<>();
        for (int i=0; i<100; i++) {
            threads.add(new Thread(() -> {
                for (int j=0; j<1000; j++) {
                    synchronized (counter) {
                        counter.increment();
                    }
                }
                latch.countDown();
            }));
            threads.get(i).start();
        }
        latch.await();
        System.out.println("Итоговое число за 100 потоков: " + counter.getCount());

        //Forth Task
        System.out.println("\n" + "Четвертое задание");
        Thread firstThread = new TwoThreads("This is a first thread");
        Thread secondThread = new TwoThreads("This is a second thread");
        firstThread.start();
        secondThread.start();
    }
}
