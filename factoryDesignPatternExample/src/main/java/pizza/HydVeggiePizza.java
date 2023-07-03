package pizza;

public class HydVeggiePizza extends Pizza {
    public HydVeggiePizza() {
        super("Hyd Style Veggie Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+this.getType());
    }
}
