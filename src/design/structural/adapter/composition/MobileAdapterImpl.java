package design.structural.adapter.composition;

public class MobileAdapterImpl implements MobileAdapter {

    private int factor;

    public MobileAdapterImpl(int factor) {
        this.factor = factor;
    }

    @Override
    public void convert(Volt volt) {
        int outputVolt = volt.getInputVolt() / factor;
        System.out.println("Converting " + volt.getInputVolt() + " Volt to " + outputVolt + " Volt");
    }

}
