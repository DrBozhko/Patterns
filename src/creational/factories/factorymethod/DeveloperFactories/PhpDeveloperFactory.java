package creational.factories.factorymethod.DeveloperFactories;

import creational.factories.factorymethod.Developers.Developer;
import creational.factories.factorymethod.Developers.PhpDeveloper;

public class PhpDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new PhpDeveloper();
    }
}
