package stocks;

import java.math.BigDecimal;

import junit.framework.Assert;

import org.junit.Test;

public class StockQuoterTest {

	@Test
	public void testLookupQuote() {
		StockQuoter quoter = new StockQuoter();
		quoter.setQuoteService(new NyseQuoteServiceImpl());
		quoter.setStockSymbol("RHT");
		quoter.lookupQuote();
		Assert.assertEquals(new BigDecimal("62.05"), quoter.getStockQuote());

		Assert.assertEquals("Red Hat", quoter.getStockName());
		Assert.assertEquals("RHT", quoter.getStockSymbol());
	}
}
