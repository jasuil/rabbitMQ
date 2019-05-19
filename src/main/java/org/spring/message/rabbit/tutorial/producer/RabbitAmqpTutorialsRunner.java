package org.spring.message.rabbit.tutorial.producer;

import java.util.concurrent.TimeUnit;

import org.spring.message.rabbit.tutorial.reciever.NewReceiver;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

//@Component
public class RabbitAmqpTutorialsRunner implements CommandLineRunner {

    private final RabbitTemplate rabbitTemplate;
    private final NewReceiver receiver;

    public RabbitAmqpTutorialsRunner(NewReceiver receiver, RabbitTemplate rabbitTemplate) {
        this.receiver = receiver;
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Sending message...");
        rabbitTemplate.convertAndSend("spring-boot-exchange", "foo.bar.baz", "Hello from RabbitMQ!");
        receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
    }

}