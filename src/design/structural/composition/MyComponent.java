package design.structural.composition;

public class MyComponent {

    public static void main(String[] args) {
        ContentPanel panel = new ContentPanel();
        panel.add(new Button());
        panel.add(new TextArea());

        panel.forceLayout();
        panel.render();
    }

}
