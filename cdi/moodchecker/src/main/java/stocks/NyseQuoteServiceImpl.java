package stocks;

import java.math.BigDecimal;

@NYSE
public class NyseQuoteServiceImpl extends AbstractQuoteService {

	static {
		STOCKS.put("RHT", new BigDecimal("62.05"));
		STOCK_NAMES.put("RHT", "Red Hat");
		STOCKS.put("PG", new BigDecimal("67.00"));
		STOCK_NAMES.put("PG", "Procter and Gamble Co.");	
		STOCKS.put("IBM", new BigDecimal("200.00"));
		STOCK_NAMES.put("IBM", "International Business Machines");
	}

	@Override
	public String getStockExchangeName() {

		return "NYSE";
	}

}
