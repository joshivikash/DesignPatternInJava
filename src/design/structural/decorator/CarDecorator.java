package design.structural.decorator;

public class CarDecorator implements Car {

    private Car car;

    public CarDecorator(Car car) {
        // TODO Auto-generated constructor stub
        this.car = car;
    }

    @Override
    public void assemble() {
        car.assemble();
    }

}
