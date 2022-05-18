package behavioral.strategy.realization;

import behavioral.strategy.behaviors.DisplayBehavior;

public class DisplayText implements DisplayBehavior {
    @Override
    public void display() {
        System.out.println("Display text");
    }
}
