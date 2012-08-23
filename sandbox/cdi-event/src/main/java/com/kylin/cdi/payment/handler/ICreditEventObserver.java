package com.kylin.cdi.payment.handler;

import javax.enterprise.event.Observes;


import com.kylin.cdi.payment.events.PaymentEvent;
import com.kylin.cdi.payment.qualifiers.Credit;

public interface ICreditEventObserver {
	
	public void onCreditPaymentEvent(@Observes @Credit PaymentEvent event);

}
