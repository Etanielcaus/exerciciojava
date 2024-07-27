package Threads.Services;

import Threads.domain.Members;

public class SendEmailService implements Runnable{
    private final Members members;

    public SendEmailService(Members members) {
        this.members = members;
    }

    @Override
    public void run() {
        while (members.isOpen() || members.pendingEmails() > 0){
            try {
                String retrEmail = members.retrieveEmails();
                if (retrEmail == null) continue;
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Yeah");
    }
}
