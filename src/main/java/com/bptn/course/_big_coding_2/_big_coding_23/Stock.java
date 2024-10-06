package com.bptn.course._big_coding_2._big_coding_23;

public class Stock {

    // Create instance variables 
    private String tickerSymbol;
    private String companyName;
    private int price;
    private double percentChange;
    private int totalShares;
    private long marketCap;

    // Constructor 
    public Stock(String tickerSymbol, String companyName, int price, int totalShares) {
        this.tickerSymbol = tickerSymbol.toUpperCase();  // Convert tickerSymbol to uppercase
        this.companyName = companyName;
        this.price = price;
        this.totalShares = totalShares;
        this.percentChange = 0.0;  // Default to 0
        this.marketCap = (long) price * totalShares;  // Calculate marketCap
    }
    
    // Create the methods 
    public void adjustPrice(int change) {
        // ? int oldPrice = this.price;
        this.price = change + price;  // Add the change to the current price
        this.percentChange = ((double) (change) / this.price) * 100;  // Calculate percentChange
        this.marketCap = (long) this.price * this.totalShares;  // Recalculate marketCap
    }


    // Override toString method
    @Override
    public String toString() {
        return "Ticker Symbol: " + this.tickerSymbol + "\n" +
               "Company: " + this.companyName + "\n" +
               "Current Price: $" + this.price + " (" + this.percentChange + "%)\n" +
               "Market Cap: $" + this.marketCap;
    }

    // Don't modify the code below:
    public static void main(String[] args) {
        Stock stock = new Stock("GOOG", "Google, Inc.", 802, 6700);
        System.out.println(stock);
        stock.adjustPrice(20);
        System.out.println(stock);
    }
}

