package mgbbanonymizer.gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.Component;
import java.util.List;

public class ComponentUpdater implements ActionListener {

    private static List<Component> components = new ArrayList<Component>();

    public void addComponent(Component component) {
        components.add(component);
    }

    @Override
    public void actionPerformed(ActionEvent arg0) {
        for(Component component : components) {
            component.repaint();
        }
    }
}