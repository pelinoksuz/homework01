public class AppleStore {
    private String storeName;
    private double exchangeRate;
    private double macCost;
    private double macPrice;
    private int soldMacCount;
    public double totalRevenue;
    public double totalProfit;
    public double totalCost;

    public AppleStore(String storeName, double macCost, double macPrice){

        this.storeName = storeName;
        this.macCost = macCost;
        this.macPrice = macPrice;

        soldMacCount = 0;
        exchangeRate = 7.5;
        totalRevenue = 0.0;
        totalProfit = 0.0;
    }

    public void sellMacs(int soldMac){
        soldMacCount = soldMac + soldMacCount;
        System.out.println("Number of sold Mac = " + soldMacCount);
    }
    public void setExchangeRate(double  NewRate){
        this.exchangeRate = NewRate;
        System.out.println("The exchange rate has been changed!");
        System.out.println("The exchange rate: 1 USD = " +  NewRate + " TL");
    }
    public double getRevenue(){

        totalRevenue = exchangeRate * ( macPrice * soldMacCount );

        return totalRevenue;
    }
    public double getProfit(){

        return totalProfit;
    }

    public double totalCost(){
        totalCost = exchangeRate*(macCost * soldMacCount);
        return totalCost;
    }

    public String toString(){

        return "Apple Store Name: " + storeName
                + "\nThe cost of a Macbook: " + macCost + " USD"
                +"\nThe price of a Macbook: " + macPrice + " USD"
                + "\nThe exchange rate: 1 USD = " + exchangeRate + "TL";
    }
}
