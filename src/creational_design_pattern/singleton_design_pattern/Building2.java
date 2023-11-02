package creational_design_pattern.singleton_design_pattern;

/**
 * Eger way of implementation.
 */
public class Building2 {

    //Eger way
    private static Building2 building2 = new Building2();
    public static Building2 getBuilding2(){
        return  building2;
    }
}
