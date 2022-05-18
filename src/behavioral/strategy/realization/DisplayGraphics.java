package behavioral.strategy.realization;

import behavioral.strategy.behaviors.DisplayBehavior;

public class DisplayGraphics implements DisplayBehavior {
    @Override
    public void display() {
        System.out.println("Display graphics");
    }
}
