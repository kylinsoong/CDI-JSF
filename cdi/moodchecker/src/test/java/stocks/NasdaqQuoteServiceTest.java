package stocks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class NasdaqQuoteServiceTest {

	QuoteService service;

	@Before
	public void getService() {
		service = new NasdaqQuoteServiceImpl();
	}

	@Test
	public void testGetStockExchangeName() {
		assertEquals("NASDAQ", service.getStockExchangeName());
	}

	// @Test(expected = UnknownStock.class)
	// public void testLookupSymbol() {
	// assertEquals("Red Hat", service.lookupSymbol("RHT"));
	//
	// service.lookupSymbol("RHM");
	//
	// }

	@Test(expected = UnknownStock.class)
	public void testBadQuote() {
		service.getQuote("RHM");
	}

	@Test
	public void testGetQuote() {
		assertEquals(new BigDecimal("56.29"), service.getQuote("INTU"));
		assertTrue(!new BigDecimal("60").equals(service.getQuote("YHOO")));
	}
}
