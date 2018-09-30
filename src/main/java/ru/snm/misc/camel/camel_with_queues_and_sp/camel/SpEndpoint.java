package ru.snm.misc.camel.camel_with_queues_and_sp.camel;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * @author sine-loco
 */
@Component( "from-jms-endpoint" )
public class SpEndpoint implements Processor {
    private final static Logger logger = LogManager.getLogger();


    @Override
    public void process( Exchange exchange ) throws Exception {
        logger.error( "received: {}", exchange );

    }
}
