package com.kylin.cdi.payment.handler;

import javax.enterprise.event.Observes;

import com.kylin.cdi.payment.events.PaymentEvent;
import com.kylin.cdi.payment.qualifiers.Cash;

public interface ICashEventObserver {

	public void onCashPaymentEvent(@Observes @Cash PaymentEvent event);
}
