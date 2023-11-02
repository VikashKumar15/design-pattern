package creational_design_pattern.abstract_factory_design;

public class Client {


    public static void main(String[] args) {

        Employee e1  = EmployeeFactory.getEmploye(new AndroidDevAbsFactory());
        System.out.println(e1.getName());

    }
}
