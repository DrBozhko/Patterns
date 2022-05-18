package behavioral.visitor.domain;

import behavioral.visitor.developers.Developer;

public class Project implements ProjectElement {
    private ProjectElement[] projectElement;

    public Project() {
        this.projectElement = new ProjectElement[]{
                new ProjectClass(),
                new Database(),
                new Test()
        };
    }

    @Override
    public void beWritten(Developer developer) {
        for (ProjectElement element : projectElement) {
            element.beWritten(developer);
        }
    }
}
