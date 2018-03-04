package design.behavioral.templateMethods;

public abstract class BasicHouse {

    public BasicHouse(String houseType) {
        // TODO Auto-generated constructor stub
        System.out.println("###############################################################");
        System.out.println("Building " + houseType);
        System.out.println("###############################################################");
    }

    private final void buildFoundation() {
        // TODO Auto-generated method stub
        System.out.println("Building Foundation.....");
    }

    protected void buildWalls() {
        // TODO Auto-generated method stub
        System.out.println("Building Walls ....");
    }

    protected void buildRooms() {
        // TODO Auto-generated method stub
        System.out.println("Building Rooms....");
    }

    protected void buildRoof() {
        // TODO Auto-generated method stub
        System.out.println("Building Roof.....");
    }

    protected final void buildHouse() {
        buildFoundation();
        buildWalls();
        buildRooms();
        buildRoof();
    }
}
