package pizzaStore;

import pizza.BlrCheesePizza;
import pizza.BlrVeggiePizza;
import pizza.Pizza;

public class BlrPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese"))
            pizza = new BlrCheesePizza();
        else if(type.equals("veggie"))
            pizza = new BlrVeggiePizza();
        return pizza;
    }
}
