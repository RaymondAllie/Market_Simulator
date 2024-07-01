public class Order {
    public int amount;
    public int price;
    public Ticker tck;
    public boolean buy;
    public boolean sell;
    public Order(Ticker tck, int amount, int price, boolean buy) {
        this.tck = tck;
        this.amount = amount;
        this.price = price;
        this.buy = buy;
        this.sell = !buy;
    }
}