package creational_design_pattern.abstract_factory_design;

public class AndroidDevAbsFactory extends EmployeeAbstractFactory{
    @Override
    Employee createEmploye() {
        return new AndroidDeveloper();
    }
}
