package stocks;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class NyseQuoteServiceTest {

	QuoteService service;

	@BeforeClass
	public static void showBeforeClass() {
		System.out.println("In before class");
	}

	@Before
	public void getService() {
		service = new NyseQuoteServiceImpl();
		System.out.println("In before");
	}

	@Test
	public void testGetStockExchangeName() {
		assertEquals("NYSE", service.getStockExchangeName());
	}

	@Test(expected = UnknownStock.class)
	public void testLookupSymbol() {
		assertEquals("Intuit", service.lookupSymbol("INTU"));

		service.lookupSymbol("ABC");
	}

	@Test
	public void testGetQuote() {
		assertEquals(new BigDecimal("200.00"), service.getQuote("IBM"));
		assertTrue(!new BigDecimal("60").equals(service.getQuote("RHT")));
	}

}
