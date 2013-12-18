package stocks;

import java.math.BigDecimal;

public interface QuoteService {

	public String lookupSymbol(String symbol);
	
	public BigDecimal getQuote(String symbol);
	
	public String getStockExchangeName();
}
