package duck;

import fly.NoFly;
import quack.NoQuack;

public class ModelDuck extends Duck {
    public ModelDuck() {
        super(new NoFly(), new NoQuack());
    }

    @Override
    public void display() {
        System.out.println("I am a model duck.");
    }
}
