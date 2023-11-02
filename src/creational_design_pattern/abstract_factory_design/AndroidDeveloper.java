package creational_design_pattern.abstract_factory_design;

public class AndroidDeveloper implements Employee{
    @Override
    public int getSalary() {
        return 10000;
    }

    @Override
    public String getName() {
        return "Android Developer";
    }
}
