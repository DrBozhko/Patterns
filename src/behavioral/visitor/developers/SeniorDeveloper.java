package behavioral.visitor.developers;

import behavioral.visitor.domain.Database;
import behavioral.visitor.domain.ProjectClass;
import behavioral.visitor.domain.Test;

public class SeniorDeveloper implements Developer{
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Rewriting class after junior...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Fixing database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating reliable test...");
    }
}
