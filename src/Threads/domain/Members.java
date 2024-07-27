package Threads.domain;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Members {
    private final Queue<String> emails = new ArrayBlockingQueue<>(10);
    private boolean open = true;

    public boolean isOpen() {
        return open;
    }

    public int pendingEmails(){
        synchronized (emails){
            return emails.size();
        }
    }

    public void addEmails(String email){
        synchronized (emails){
            this.emails.add(email);
            this.emails.notifyAll();
        }
    }

    public String  retrieveEmails() throws InterruptedException {
        synchronized (this.emails){
            while (this.emails.isEmpty()){
            if (!open) break;
            this.emails.wait();
            }
            return this.emails.poll();
        }
    }

    public void isClose(){
        open = false;
    }
}
