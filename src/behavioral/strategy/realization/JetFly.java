package behavioral.strategy.realization;

import behavioral.strategy.behaviors.FlyBehavior;

public class JetFly implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Jet fly");
    }
}
