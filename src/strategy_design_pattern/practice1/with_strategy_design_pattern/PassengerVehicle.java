package strategy_design_pattern.practice1.with_strategy_design_pattern;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle(DriveStrategy driveStrategy) {
        super(driveStrategy);
    }
}
