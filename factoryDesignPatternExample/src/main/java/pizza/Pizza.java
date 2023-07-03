package pizza;

public abstract class Pizza {
    private final String type;
    public Pizza(String type) {
        this.type = type;
    }

    public abstract void prepare();

    public void bake() {
        System.out.println("Baking the pizza.");
    }
    public void cut() {
        System.out.println("Cutting the pizza.");
    }

    public void box() {
        System.out.println("Packing the pizza.");
    }

    public String getType() {
        return this.type;
    }

}
