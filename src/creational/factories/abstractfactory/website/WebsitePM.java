package creational.factories.abstractfactory.website;

import creational.factories.abstractfactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Website PM manages website project...");
    }
}
