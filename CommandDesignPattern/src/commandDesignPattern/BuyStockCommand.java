/*
 * @author Douglas Wendel
 * This is a simple class that calls the buy
 * method in the stocktrade class to return the proper 
 * information. it also sets its attributes. a
 * 
 */
package commandDesignPattern;
public class BuyStockCommand implements Command {
	private StockTrade stockTrade;
	private String stockName;
	private int shares;
	
	public BuyStockCommand(StockTrade stockTrade, String stockName, int shares) {
		this.stockTrade = stockTrade;
		this.stockName = stockName;
		this.shares = shares;
	}
	public void execute() {
		StockTrade.buy(stockName,shares);
	}
}
