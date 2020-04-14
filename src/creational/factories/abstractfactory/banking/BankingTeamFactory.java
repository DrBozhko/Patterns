package creational.factories.abstractfactory.banking;

import creational.factories.abstractfactory.Developer;
import creational.factories.abstractfactory.ProjectManager;
import creational.factories.abstractfactory.ProjectTeamFactory;
import creational.factories.abstractfactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
