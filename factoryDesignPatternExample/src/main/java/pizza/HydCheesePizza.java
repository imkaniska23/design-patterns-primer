package pizza;

public class HydCheesePizza extends Pizza {
    public HydCheesePizza() {
        super("Hyd Style Cheese Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+this.getType());
    }
}
