package design.behavioral.templateMethods;

public class WoodenHouse extends BasicHouse {
    public WoodenHouse(String houseType) {
        super(houseType);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void buildRoof() {
        // TODO Auto-generated method stub
        System.out.println("Build wooden roof...");
    }

    @Override
    protected void buildWalls() {
        // TODO Auto-generated method stub
        System.out.println("Build wooden walls....");
    }

    @Override
    protected void buildRooms() {
        // TODO Auto-generated method stub
        System.out.println("Build Rooms with wooden separation.");
    }
}
