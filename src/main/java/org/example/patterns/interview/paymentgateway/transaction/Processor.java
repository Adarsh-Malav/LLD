package org.example.patterns.interview.paymentgateway.transaction;


import org.example.patterns.interview.paymentgateway.instrument.InstrumentDO;

public class Processor {

    public void processPayment(InstrumentDO senderInstrumentDO, InstrumentDO receiverInstrumentDO) {

        // validate sender instrument

        // validate receiver instrument

        // process payment

        // update balance in sender instrument - debit

        // update balance in receiver instrument - credit

    }
}
