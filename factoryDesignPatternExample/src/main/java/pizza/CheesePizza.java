package pizza;

public class CheesePizza extends Pizza {
    public CheesePizza() {
        super("Cheese");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+this.getType()+" pizza.");
    }
}
