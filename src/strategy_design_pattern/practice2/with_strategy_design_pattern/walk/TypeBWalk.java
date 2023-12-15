package strategy_design_pattern.practice2.with_strategy_design_pattern.walk;

public class TypeBWalk implements WalkBehaviour{
    @Override
    public void walk() {
        System.out.println("Type B walk.");
    }
}

