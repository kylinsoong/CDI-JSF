package stocks;

import java.math.BigDecimal;

@Nasdaq
public class NasdaqQuoteServiceImpl extends AbstractQuoteService {


	static {
		STOCKS.put("INTU", new BigDecimal("56.29"));
		STOCK_NAMES.put("INTU", "Intuit");
		STOCKS.put("MSFT", new BigDecimal("31.92"));
		STOCK_NAMES.put("MSFT", "Microsoft");	
		STOCKS.put("YHOO", new BigDecimal("15.43"));
		STOCK_NAMES.put("YHOO", "Yahoo!");
	}

	@Override
	public String getStockExchangeName() {
		return "NASDAQ";
	}

}
