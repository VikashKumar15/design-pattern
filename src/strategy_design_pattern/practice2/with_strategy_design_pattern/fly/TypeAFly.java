package strategy_design_pattern.practice2.with_strategy_design_pattern.fly;

public class TypeAFly implements FlyBehaviour{
    @Override
    public void fly() {
        System.out.println("Type A fly");
    }
}
