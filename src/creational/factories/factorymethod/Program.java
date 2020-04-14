package creational.factories.factorymethod;

import creational.factories.factorymethod.DeveloperFactories.CppDeveloperFactory;
import creational.factories.factorymethod.DeveloperFactories.DeveloperFactory;
import creational.factories.factorymethod.DeveloperFactories.JavaDeveloperFactory;
import creational.factories.factorymethod.DeveloperFactories.PhpDeveloperFactory;
import creational.factories.factorymethod.Developers.Developer;

public class Program {
    public static void main(String[] args) {
        DeveloperFactory developerFactory = createDeveloperBySpecialty("php");
        Developer developer = developerFactory.createDeveloper();

        developer.writeCode();
    }

    static DeveloperFactory createDeveloperBySpecialty(String specialty) {
        if (specialty.equalsIgnoreCase("java")) {
            return new JavaDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("c++")) {
            return new CppDeveloperFactory();
        } else if (specialty.equalsIgnoreCase("php")) {
            return new PhpDeveloperFactory();
        } else {
            throw new RuntimeException(specialty + " is unknown specialty.");
        }
    }
}
