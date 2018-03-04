package design.structural.adapter.composition;

public class Mobile {
    MobileAdapter adapter;

    public Mobile(MobileAdapter adapter) {
        // TODO Auto-generated constructor stub
        this.adapter = adapter;
    }

    void charge(Volt volt) {
        adapter.convert(volt);
    }
}
