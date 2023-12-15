package strategy_design_pattern.practice2.with_strategy_design_pattern;

import strategy_design_pattern.practice2.with_strategy_design_pattern.fly.TypeAFly;
import strategy_design_pattern.practice2.with_strategy_design_pattern.walk.TypeAWalk;
import strategy_design_pattern.practice2.with_strategy_design_pattern.walk.TypeBWalk;

public class Client {
    public static void main(String[] args) {
        Duck mountainDuck = new Duck(new TypeAFly(), new TypeBWalk());
        mountainDuck.fly();
        mountainDuck.walk();
    }
}
