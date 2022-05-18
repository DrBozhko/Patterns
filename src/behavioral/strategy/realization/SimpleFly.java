package behavioral.strategy.realization;

import behavioral.strategy.behaviors.FlyBehavior;

public class SimpleFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Simple fly");
    }
}
