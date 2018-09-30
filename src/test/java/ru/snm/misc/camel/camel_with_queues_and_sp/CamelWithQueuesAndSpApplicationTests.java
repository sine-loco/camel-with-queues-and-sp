package ru.snm.misc.camel.camel_with_queues_and_sp;

import org.apache.camel.test.spring.CamelSpringBootRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.jms.*;

@SpringBootTest
@RunWith( CamelSpringBootRunner.class )
public class CamelWithQueuesAndSpApplicationTests {

    static String queueName = "in-memory.in";
    Session session;
    Destination destination;
    MessageProducer producer;

    @Autowired
    ConnectionFactory jmsConnectionFactory;

    @Before
    public void setup() throws JMSException {
        Connection conn = jmsConnectionFactory.createConnection();
        conn.start();
        session = conn.createSession( false, Session.AUTO_ACKNOWLEDGE );
        destination = session.createQueue( queueName );
        producer = session.createProducer( destination );
        producer.setDeliveryMode( DeliveryMode.NON_PERSISTENT );
    }

    @Test
    public void t() {
        try {
            TextMessage txtMessage = session.createTextMessage();
            txtMessage.setText( "Larry the Cable Guy" );

            //when:
            producer.send( destination, txtMessage );

            

        } catch ( Exception e ) {
            Assert.fail();
        }
    }

}
