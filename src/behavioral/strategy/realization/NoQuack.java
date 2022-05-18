package behavioral.strategy.realization;

import behavioral.strategy.behaviors.QuackBehavior;

public class NoQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("No quack");
    }
}
