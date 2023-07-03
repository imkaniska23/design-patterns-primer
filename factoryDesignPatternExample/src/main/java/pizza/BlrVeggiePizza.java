package pizza;

public class BlrVeggiePizza extends Pizza {
    public BlrVeggiePizza() {
        super("Blr Style Veggie Pizza");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+this.getType());
    }
}
