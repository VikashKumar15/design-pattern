package creational_design_pattern.factory_design_pattern;

public class DeveloperClient {

    public static void main(String[] args) {
        Employee emp = EmployeFactory.getEmploye("ANDROID DEVELOPER");
        System.out.println(emp.getSalary());
    }
}
