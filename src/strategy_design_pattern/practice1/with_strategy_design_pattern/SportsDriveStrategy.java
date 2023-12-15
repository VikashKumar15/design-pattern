package strategy_design_pattern.practice1.with_strategy_design_pattern;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Special Drive Capability");
    }
}
