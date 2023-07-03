import duck.Duck;
import duck.MallardDuck;
import duck.ModelDuck;
import duck.RubberDuck;
import fly.FlyWithRocket;

public class Main {
    public static void main(String[] args) {
        Duck d = new MallardDuck();
        d.display();
        d.performFly();
        d.performQuack();
        d.swim();
        System.out.println("--------");
        d = new ModelDuck();
        d.display();
        d.performFly();
        d.setFlyBehaviour(new FlyWithRocket());
        d.performFly();
        d.performQuack();
        d.swim();
        System.out.println("---------");
        d = new RubberDuck();
        d.display();
        d.performFly();
        d.performQuack();
        d.swim();
    }
}
