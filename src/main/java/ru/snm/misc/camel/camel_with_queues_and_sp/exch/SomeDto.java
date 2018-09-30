package ru.snm.misc.camel.camel_with_queues_and_sp.exch;

import java.math.BigDecimal;

/**
 * @author sine-loco
 */
public final class SomeDto {
    private final String string;
    private final BigDecimal bigDecimal;

    public SomeDto( String string, BigDecimal bigDecimal ) {
        this.string = string;
        this.bigDecimal = bigDecimal;
    }

    public String getString() {
        return string;
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }
}
