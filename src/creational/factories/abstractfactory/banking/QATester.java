package creational.factories.abstractfactory.banking;

import creational.factories.abstractfactory.Tester;

public class QATester implements Tester {
    @Override
    public void testCode() {
        System.out.println("QA tester tests banking code...");
    }
}
