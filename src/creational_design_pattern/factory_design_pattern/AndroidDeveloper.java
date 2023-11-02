package creational_design_pattern.factory_design_pattern;

public class AndroidDeveloper implements Employee{

    @Override
    public int getSalary() {
        System.out.println("Getting android developer salary");
        return 800000;
    }
}
