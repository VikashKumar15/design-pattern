package strategy_design_pattern.practice1.without_strategy_design_pattern;

public class Client {
    public static void main(String[] args) {

        OffRoadVehicle offRoadVehicle = new OffRoadVehicle();
        offRoadVehicle.drive();

        SportsVehicle sportsVehicle = new SportsVehicle();
        sportsVehicle.drive();

        PassengerVehicle passengerVehicle = new PassengerVehicle();
        passengerVehicle.drive();
    }
}
