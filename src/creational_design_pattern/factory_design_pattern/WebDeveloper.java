package creational_design_pattern.factory_design_pattern;

public class WebDeveloper implements Employee{

    @Override
    public int getSalary() {
        System.out.println("Getting salary for Web Developer");
        return 1000000;
    }
}
