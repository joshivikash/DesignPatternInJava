package design.structural.decorator;

public class CarFactory {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println();
        Car luxuryCar = new LuxuryCar(new BasicCar());
        luxuryCar.assemble();
        System.out.println();
        Car luxurySportsCar = new LuxuryCar(new SportsCar(new BasicCar()));
        luxurySportsCar.assemble();
    }
}
