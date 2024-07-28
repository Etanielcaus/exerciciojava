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
            System.out.println(Thread.currentThread().getName() + " / Dentro do Run, que verifica se members esta aberto.");
            try {
                String retrEmail = members.retrieveEmails();
                if (retrEmail == null) continue;
                System.out.println(Thread.currentThread().getName() + " / Thread espera dois segundo se retrEmail for null.");
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Yeah");
    }
}
