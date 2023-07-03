package quack;

public class NoQuack implements QuackBehaviour {
    @Override
    public void quack() {
        System.out.println("I can't make any sound.");
    }
}
