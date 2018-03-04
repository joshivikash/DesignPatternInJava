package design.structural.composition;

public class Button implements Component {

    public Button() {
        System.out.println("Building Button");
    }

    @Override
    public void forceLayout() {
        System.out.println("Layouting Button");
    }

    @Override
    public void render() {
        System.out.println("Rendering Button");
    }

}
