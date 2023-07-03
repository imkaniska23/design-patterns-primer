package pizzaStore;

import pizza.*;

public class HydPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese"))
            pizza = new HydCheesePizza();
        else if(type.equals("veggie"))
            pizza = new HydVeggiePizza();
        return pizza;
    }
}
