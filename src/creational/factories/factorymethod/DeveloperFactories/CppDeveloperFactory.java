package creational.factories.factorymethod.DeveloperFactories;

import creational.factories.factorymethod.Developers.CppDeveloper;
import creational.factories.factorymethod.Developers.Developer;

public class CppDeveloperFactory implements DeveloperFactory{
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
