package design.behavioral.templateMethods;

public class GlassHouse extends BasicHouse {
    public GlassHouse(String houseType) {
        super(houseType);
        // TODO Auto-generated constructor stub
    }

    @Override
    protected void buildRoof() {
        // TODO Auto-generated method stub
        super.buildRoof();
        System.out.println("Cover roof with glass plate");
    }

    @Override
    protected void buildWalls() {
        // TODO Auto-generated method stub
        super.buildWalls();
        System.out.println("Cover walls with Glass plate");
    }

    @Override
    protected void buildRooms() {
        // TODO Auto-generated method stub
        super.buildRooms();
        System.out.println("Cover Room's walls with glass plates");
    }
}
