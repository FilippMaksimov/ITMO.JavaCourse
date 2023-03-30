package ITMO.JavaCourse.MultithreadingLab;

public class TwoThreads extends Thread {
    private String name;
    public TwoThreads(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                System.out.println(name);
                //Продолжает работу потока, у котрого был вызван wait
                notify();
                try {
                    Thread.sleep(100);
                    //Переводит вызывающий поток в состояние ожидания до тех пор, пока в другом потоке не будет вызван notify
                    wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
