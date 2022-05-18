package behavioral.visitor.developers;

import behavioral.visitor.domain.Database;
import behavioral.visitor.domain.ProjectClass;
import behavioral.visitor.domain.Test;

public class JuniorDeveloper implements Developer {
    @Override
    public void create(ProjectClass projectClass) {
        System.out.println("Writing class...");
    }

    @Override
    public void create(Database database) {
        System.out.println("Create database...");
    }

    @Override
    public void create(Test test) {
        System.out.println("Creating test...");
    }
}
