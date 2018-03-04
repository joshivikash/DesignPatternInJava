package design.structural.decorator;

public class BasicCar implements Car {

    @Override
    public void assemble() {
        System.out.print(" Assembling Basic Car");
    }

}
