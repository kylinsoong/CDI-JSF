package com.kylin.cdi.payment.handler;

import javax.enterprise.event.Observes;


import com.kylin.cdi.payment.events.PaymentEvent;
import com.kylin.cdi.payment.qualifiers.Debit;

public interface IDebitEventObserver {
	
	public void onDebitPaymentEvent(@Observes @Debit PaymentEvent event);

}
