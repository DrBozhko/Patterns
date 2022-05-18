package behavioral.visitor.developers;

import behavioral.visitor.domain.Database;
import behavioral.visitor.domain.ProjectClass;
import behavioral.visitor.domain.Test;

public interface Developer {
    void create(ProjectClass projectClass);

    void create(Database database);

    void create(Test test);
}
