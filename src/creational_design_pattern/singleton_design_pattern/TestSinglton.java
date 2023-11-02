package creational_design_pattern.singleton_design_pattern;

public class TestSinglton {

    public static void main(String[] args) {
        Building building = Building.getBuilding();
        Building building2 = Building.getBuilding();
        Building building3 = Building.getBuilding();
        Building building4 = Building.getBuilding();
        System.out.println(building.hashCode());
        System.out.println(building2.hashCode());
        System.out.println(building3.hashCode());
        System.out.println(building4.hashCode());

        Building2 b1 = Building2.getBuilding2();
        Building2 b2 = Building2.getBuilding2();
        System.out.println(b1.hashCode());
        System.out.println(b2.hashCode());
    }
}
