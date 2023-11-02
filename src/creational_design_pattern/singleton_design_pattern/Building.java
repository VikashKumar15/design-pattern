package creational_design_pattern.singleton_design_pattern;

/**
 * This design pattern is for the scenario where the requirement it to create only one object of any class.
 *
 * 1. Constructor pirvate.
 * 2. Below implementation is lazy way of implementation
 *
 */
public class Building {

    private Building(){}

    private static Building building;

    public static Building getBuilding(){

        synchronized (Building.class    ){
            if(building == null){
                building = new Building();
            }
        }
        return building;
    }

}
