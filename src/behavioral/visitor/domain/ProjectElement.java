package behavioral.visitor.domain;

import behavioral.visitor.developers.Developer;

public interface ProjectElement {
    void beWritten(Developer developer);
}
