package design.structural.composition;

import java.util.ArrayList;
import java.util.List;

public class ContentPanel implements Component {

    public ContentPanel() {
        System.out.println("Building Content Panel");
    }

    private List<Component> components = new ArrayList<Component>();

    @Override
    public void forceLayout() {
        System.out.println("Layouting Content Panel.");
        for (Component component : components) {
            component.forceLayout();
        }
    }

    @Override
    public void render() {
        System.out.println("Rendering Content Panel");
        for (Component component : components) {
            component.render();
        }
    }

    void add(Component component) {
        components.add(component);
    }

}
