package ru.snm.misc.camel.camel_with_queues_and_sp;

import org.apache.activemq.command.ActiveMQQueue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.annotation.EnableJms;

import javax.jms.Queue;

/**
 * @author sine-loco
 */

@EnableJms
@Configuration
public class ActiveMqConfig {
    @Bean
    public Queue queue(){
        return new ActiveMQQueue("in-memory.in");
    }
}
