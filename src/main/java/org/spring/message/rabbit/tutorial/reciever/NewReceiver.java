package org.spring.message.rabbit.tutorial.reciever;


import java.util.concurrent.CountDownLatch;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class NewReceiver {

    private CountDownLatch latch = new CountDownLatch(1);

    public void receiveMessage(String message) {
        try {
            Thread.sleep(10000);
        }catch (Exception e){

        }

        System.out.println("Received <" + message + ">");
        latch.countDown();
    }

    public CountDownLatch getLatch() {
        return latch;
    }

}
