package strategy_design_pattern.practice2.with_strategy_design_pattern.fly;

public class TypeBFly implements FlyBehaviour{


    @Override
    public void fly() {
        System.out.println("Type B Fly");
    }
}
