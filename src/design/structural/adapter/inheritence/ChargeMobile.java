package design.structural.adapter.inheritence;

public class ChargeMobile {

    public static void main(String[] args) {
        MobileWithAdapter basicMobile = new MobileWithAdapter(200);
        basicMobile.charge(new Volt(200));

        MobileWithAdapter smartPhone = new MobileWithAdapter(100);
        smartPhone.charge(new Volt(200));
    }

}
