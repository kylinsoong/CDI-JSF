package stocks;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public abstract class AbstractQuoteService implements QuoteService {

	protected final static Map<String, BigDecimal> STOCKS = new HashMap<String, BigDecimal>(3);
	protected final static Map<String, String> STOCK_NAMES = new HashMap<String, String>(3);
	
	public abstract String getStockExchangeName();
	
	public String lookupSymbol(String symbol) {
		
		String name = STOCK_NAMES.get(symbol);
		if (name == null)
			throw new UnknownStock(symbol);
		
		return name;
	}

	public BigDecimal getQuote(String symbol) {

		BigDecimal quote = STOCKS.get(symbol);
		
		if (quote == null)
			throw new UnknownStock(symbol);
		
		return quote;
	}

}
