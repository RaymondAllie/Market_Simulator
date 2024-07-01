import java.util.*;

public class Trader {
    public String name;
    public Map<Ticker, Integer> portfolio;
    private Market market;
    public Trader(String name, Market market) {
        this.name = name;
        this.portfolio = new HashMap<>();
        this.market = market;
    }
    public boolean create_buy(Ticker tck, int amount, double price) {
        Order order = new Order(tck, amount, price, true);
        
    }
    public boolean execute_buy(Order order) {
        assert order.buy;
        if (this.portfolio.containsKey(order.tck)) {
            this.porfolio.replace(order.tck, this.porfolio.get(order.tck) + order.amount);
        } else {
            this.porfolio.put(order.tck, order.amount);
        }
    }

}