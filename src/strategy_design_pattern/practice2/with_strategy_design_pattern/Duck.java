package strategy_design_pattern.practice2.with_strategy_design_pattern;

import strategy_design_pattern.practice2.with_strategy_design_pattern.fly.FlyBehaviour;
import strategy_design_pattern.practice2.with_strategy_design_pattern.walk.WalkBehaviour;

public class Duck {

    FlyBehaviour flyBehaviour;
    WalkBehaviour walkBehaviour;

    //constructor dependency injection.

    public Duck(FlyBehaviour flyBehaviour, WalkBehaviour walkBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.walkBehaviour = walkBehaviour;
    }

    public void fly(){
        this.flyBehaviour.fly();
    }

    public void walk(){
        this.walkBehaviour.walk();
    }
}
