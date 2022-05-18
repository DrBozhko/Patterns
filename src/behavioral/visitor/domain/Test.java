package behavioral.visitor.domain;

import behavioral.visitor.developers.Developer;

public class Test implements ProjectElement {
    @Override
    public void beWritten(Developer developer) {
        developer.create(this);
    }
}
