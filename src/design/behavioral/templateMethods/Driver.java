package design.behavioral.templateMethods;

public class Driver {
    public static void main(String[] args) {
        GlassHouse glassHouse = new GlassHouse("Glass House");
        glassHouse.buildHouse();

        WoodenHouse woodenHouse = new WoodenHouse("Wooden House");
        woodenHouse.buildHouse();
    }
}
