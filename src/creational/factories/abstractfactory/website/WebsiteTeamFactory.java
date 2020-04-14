package creational.factories.abstractfactory.website;

import creational.factories.abstractfactory.Developer;
import creational.factories.abstractfactory.ProjectManager;
import creational.factories.abstractfactory.ProjectTeamFactory;
import creational.factories.abstractfactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
