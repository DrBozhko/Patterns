package behavioral.strategy.realization;

import behavioral.strategy.behaviors.QuackBehavior;

public class SimpleQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Simple quack");
    }
}
