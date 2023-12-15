package strategy_design_pattern.practice1.without_strategy_design_pattern;

public class OffRoadVehicle extends Vehicle{

    /* here we have duplicate code. */
    @Override
    public void drive() {
        System.out.println("special drive capability");
    }
}
