package pizza;

public class ClamPizza extends Pizza {
    public ClamPizza() {
        super("Clam");
    }

    @Override
    public void prepare() {
        System.out.println("Preparing "+this.getType()+" pizza.");
    }
}
