package pizza;

public class BlrCheesePizza extends Pizza {
    public BlrCheesePizza() {
        super("Blr Style Cheese Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+this.getType());
    }
}
