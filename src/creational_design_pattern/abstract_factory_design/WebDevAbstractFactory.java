package creational_design_pattern.abstract_factory_design;

public class WebDevAbstractFactory extends EmployeeAbstractFactory{
    @Override
    Employee createEmploye() {
        return new WebDeveloper();
    }
}
