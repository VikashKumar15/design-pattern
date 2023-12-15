package strategy_design_pattern.practice1.with_strategy_design_pattern;

public class Client {

    public static void main(String[] args) {
        SportsVehicle sportsVehicle = new SportsVehicle(new SportsDriveStrategy());
        sportsVehicle.drive();

        PassengerVehicle passengerVehicle = new PassengerVehicle(new NormalDriveStrategy());
        passengerVehicle.drive();
    }
}
