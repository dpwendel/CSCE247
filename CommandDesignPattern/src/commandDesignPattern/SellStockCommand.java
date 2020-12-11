package commandDesignPattern;

public class SellStockCommand {
	private StockTrade stockTrade;
	private String stockName;
	private int  shares; 
	
	public SellStockCommand(StockTrade stockTrade, String stockName, int shares) {
		this.stockTrade = stockTrade;
		this.stockName = stockName;
		this.shares = shares;
	}
	
	public void execute() {
		StockTrade.sell(stockName, shares);
	}

}
