package Threads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private ReentrantLock lock;
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails() {
        lock.lock();
        return emails.size();
    }

    public void addEmails(String email) {
//        Qual Thread entrou aqui? QUal vai fazer a verificação?
        synchronized (this.emails) {
            this.emails.add(email);
            System.out.println(Thread.currentThread().getName() + " / dentro de add emails. ");
            this.emails.notifyAll();
        }
    }

    public String retrieveEmails() throws InterruptedException {
        synchronized (emails) {
            System.out.println(Thread.currentThread().getName() + " Esta Thread está dentro de retrieve  e fora do " +
                    "while ");
            while (this.emails.isEmpty()) {
                System.out.println(Thread.currentThread().getName() + " / Dentro do while de verificação de email.");
                if (!open) break;
                this.emails.wait();
            }

            return this.emails.poll();

        }
    }

    public void isClose() {
        open = false;
    }
}
