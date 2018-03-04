package design.structural.composition;

public class TextArea implements Component {

    public TextArea() {
        System.out.println("Building Text Area");
    }

    @Override
    public void forceLayout() {
        System.out.println("Layouting Text Area");
    }

    @Override
    public void render() {
        System.out.println("Rendering Text Area");

    }

}
