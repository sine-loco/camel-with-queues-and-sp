package ru.snm.misc.camel.camel_with_queues_and_sp.camel;

import org.apache.camel.ExchangePattern;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * @author sine-loco
 */
@Component
public class InRoute extends RouteBuilder {

    @Override
    public void configure() throws Exception {
        from( "jms:queue:in-memory.in" )
                .routeId( "from-jms" )
                //.process( "from-jms-endpoint" )
                .to( ExchangePattern.InOnly, "from-jms-endpoint" );
    }
}
