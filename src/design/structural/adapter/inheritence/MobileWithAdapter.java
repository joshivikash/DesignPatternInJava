package design.structural.adapter.inheritence;

public class MobileWithAdapter implements Mobile, MobileAdapter {

    private int factor;

    public MobileWithAdapter(int factor) {
        // TODO Auto-generated constructor stub
        this.factor = factor;
    }

    @Override
    public void convert(Volt volt) {
        System.out.println("Converting " + volt.getInput() + " Volts to " + (volt.getInput() / factor) + " Volts");
    }

    @Override
    public void charge(Volt volt) {
        convert(volt);
    }

}
