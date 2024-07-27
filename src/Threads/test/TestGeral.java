package Threads.test;

import Threads.Services.SendEmailService;
import Threads.domain.Members;

import javax.sound.midi.Track;
import javax.swing.*;

public class TestGeral {
    public static void main(String[] args) {
        Members members = new Members();
        Thread t1 = new Thread(new SendEmailService(members));
        Thread t2 = new Thread(new SendEmailService(members));

        t1.start();
        t2.start();

        while (true){
            String showInputDialog = JOptionPane.showInputDialog("Email: ");
            if (showInputDialog == null || showInputDialog.isEmpty()){
                members.isClose();
                break;
            }
            members.addEmails(showInputDialog);
        }
    }
}
