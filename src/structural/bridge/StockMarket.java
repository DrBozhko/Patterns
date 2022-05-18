package structural.bridge;

public class StockMarket extends Program{
    protected StockMarket(Developer developer) {
        super(developer);
    }

    @Override
    public void developProgram() {
        System.out.println("Stock Market development in progress...");
        developer.writeCode();
    }
}
