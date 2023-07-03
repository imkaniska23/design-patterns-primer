import pizzaStore.BlrPizzaStore;
import pizzaStore.HydPizzaStore;
import pizzaStore.PizzaStore;

public class Main {
    public static void main(String[] args) {
        PizzaStore pizzaStore = new BlrPizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("veggie");

        pizzaStore = new HydPizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore.orderPizza("veggie");
    }
}
