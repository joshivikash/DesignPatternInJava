package design.structural.adapter.composition;

public class ChargeMobile {

    public static void main(String[] args) {
        Mobile basicMobile = new Mobile(new MobileAdapterImpl(200));
        basicMobile.charge(new Volt(200));

        Mobile smartPhone = new Mobile(new MobileAdapterImpl(100));
        smartPhone.charge(new Volt(200));
    }

}
