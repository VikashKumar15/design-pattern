package creational_design_pattern.factory_design_pattern;

public class EmployeFactory {

    public static Employee getEmploye(String empType){

        if("ANDROID DEVELOPER".equalsIgnoreCase(empType.trim())){
            return new AndroidDeveloper();
        }
        else if("WEB DEVELOPER".equalsIgnoreCase(empType.trim())){
            return new AndroidDeveloper();
        }
        else
            return null;
    }
}
