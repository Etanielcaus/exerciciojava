package Threads.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Work {
    private Random rand = new Random();

    private Object obj = new Object();
    private Object obj2 = new Object();

    private List<Integer> ids = new ArrayList<Integer>();
    private List<Integer> ids2 = new ArrayList<Integer>();

    public void work() {
        synchronized (obj2) {
            System.out.println("Work started obj2");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ids.add(rand.nextInt(10));
        }
    }

    public void work2() {
        synchronized (obj) {
            System.out.println("Work started obj");
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            ids2.add(rand.nextInt(10));
        }
    }


    public void procced(Object obj) {
        for (int i = 0; i < 100000; i++) {
            work();
            work2();
        }
    }

    public void runStart(){
        System.out.println("Starting...");
        long startTime = System.currentTimeMillis();

        Thread newThread = new Thread(new Runnable() {

            @Override
            public void run() {
                procced(obj);
            }
        });
        newThread.start();

        Thread newThread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                procced(obj2);
            }
        });
        newThread2.start();

        try {
            newThread.join();
            newThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        long closeTime = System.currentTimeMillis();

        System.out.println("Total of processing Time: " + (closeTime - startTime));
        System.out.println("Integer List Size: ");
        System.out.println(ids.size());
        System.out.println(ids2.size());


    }




}
