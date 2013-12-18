package stocks;

import java.math.BigDecimal;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import javax.validation.constraints.NotNull;

@RequestScoped
@Named("quoter")
public class StockQuoter {

	@NotNull(message = "You must enter a stock symbol")
	private String stockSymbol;
	private String stockName;
	private BigDecimal stockQuote;
	private String stockExchange;

	@Inject
	// @Nasdaq
	@NYSE
	private QuoteService quoteService;

	public void lookupQuote() {

		try {
			stockName = quoteService.lookupSymbol(stockSymbol);
			stockQuote = quoteService.getQuote(stockSymbol);
		} catch (UnknownStock e) {
			FacesContext
					.getCurrentInstance()
					.addMessage(
							"symbol",
							new FacesMessage(
									FacesMessage.SEVERITY_ERROR,
									"Invalid Symbol",
									stockSymbol
											+ " is an invalid stock symbol for this stock exchange"));
		}
	}

	public String getStockSymbol() {
		return stockSymbol;
	}

	public void setStockSymbol(String stockSymbol) {
		this.stockSymbol = stockSymbol;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public BigDecimal getStockQuote() {
		return stockQuote;
	}

	public void setStockQuote(BigDecimal stockQuote) {
		this.stockQuote = stockQuote;
	}

	public String getStockExchange() {
		return stockExchange;
	}

	@SuppressWarnings("unused")
	@PostConstruct
	private void setStockExchange() {
		stockExchange = quoteService.getStockExchangeName();
	}

	public void setQuoteService(QuoteService quoteService) {
		this.quoteService = quoteService;
	}

}
