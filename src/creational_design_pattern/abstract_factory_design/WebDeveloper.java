package creational_design_pattern.abstract_factory_design;

public class WebDeveloper implements Employee{
    @Override
    public int getSalary() {
        return 30000;
    }

    @Override
    public String getName() {
        return "Android Develper";
    }
}
