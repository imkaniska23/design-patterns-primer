package pizza;

public class SimplePizzaFactory {
    public Pizza getPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese"))
            pizza = new CheesePizza();
        else if(type.equals("clam"))
            pizza = new ClamPizza();
        return pizza;
    }
}
