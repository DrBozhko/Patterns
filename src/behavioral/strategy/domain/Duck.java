package behavioral.strategy.domain;

import behavioral.strategy.behaviors.DisplayBehavior;
import behavioral.strategy.behaviors.FlyBehavior;
import behavioral.strategy.behaviors.QuackBehavior;

public class Duck implements FlyBehavior, QuackBehavior, DisplayBehavior{
    private FlyBehavior flyBehavior;
    private QuackBehavior quackBehavior;
    private DisplayBehavior displayBehavior;

    public Duck(FlyBehavior flyBehavior, QuackBehavior quackBehavior, DisplayBehavior displayBehavior) {
        this.flyBehavior = flyBehavior;
        this.quackBehavior = quackBehavior;
        this.displayBehavior = displayBehavior;
    }

    @Override
    public void fly() {
        flyBehavior.fly();
    }

    @Override
    public void display() {
        displayBehavior.display();
    }

    @Override
    public void quack() {
        quackBehavior.quack();
    }

    public FlyBehavior getFlyBehavior() {
        return flyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior() {
        return quackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public DisplayBehavior getDisplayBehavior() {
        return displayBehavior;
    }

    public void setDisplayBehavior(DisplayBehavior displayBehavior) {
        this.displayBehavior = displayBehavior;
    }


}
