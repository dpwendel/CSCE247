/*
 * @author Douglas Wendel
 * this is a simple class that when called returns wether 
 * you are buying or selling a certain amount of shares
 * and the name of the stock.
 */
package commandDesignPattern;

public class StockTrade {
	
	public StockTrade() {}
	
	public void buy(String stockName, int numShares) {
		System.out.println("Buying " +numShares+ " of " + stockName);
	}
	public void sell(String stockName, int numShares) {
		
		System.out.println("Selling " + numShares + " of " +stockName);	
	}
}
