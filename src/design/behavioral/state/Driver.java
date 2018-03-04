package design.behavioral.state;

public class Driver {
    public static void main(String[] args) {
        TV tv = new TV();
        System.out.println(tv);
        tv.setPower(true);
        System.out.println(tv);
        tv.setVolume(50);
        System.out.println(tv);
        tv.setVolume(100);
        System.out.println(tv);
        tv.setPower(false);
        System.out.println(tv);
    }
}
