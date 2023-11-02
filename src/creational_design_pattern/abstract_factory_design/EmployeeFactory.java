package creational_design_pattern.abstract_factory_design;

public class EmployeeFactory {

    public static Employee getEmploye(EmployeeAbstractFactory factory){
        return factory.createEmploye();
    }
}
