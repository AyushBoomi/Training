package Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceDemo {

    public static void main(String[] args) {
        int coreCount=Runtime.getRuntime().availableProcessors();
        ExecutorService service= Executors.newFixedThreadPool(coreCount);

        for(int i=0;i<100;i++){
            service.execute(new Task());
        }

    }

    static class Task implements Runnable{
        public void run(){
            System.out.println("Thread name:"+Thread.currentThread().getName());
        }
    }
}
