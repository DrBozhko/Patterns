package creational.factories.factorymethod.DeveloperFactories;

import creational.factories.factorymethod.Developers.Developer;
import creational.factories.factorymethod.Developers.JavaDeveloper;

public class JavaDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
