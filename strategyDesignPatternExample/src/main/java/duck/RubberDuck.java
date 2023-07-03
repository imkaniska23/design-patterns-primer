package duck;

import fly.NoFly;
import quack.Squeak;


public class RubberDuck extends Duck {
    public RubberDuck() {
        super(new NoFly(), new Squeak());
    }

    @Override
    public void display() {
        System.out.println("I am a rubber duck.");
    }
}
