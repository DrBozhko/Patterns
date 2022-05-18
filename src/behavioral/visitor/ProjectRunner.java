package behavioral.visitor;

import behavioral.visitor.developers.Developer;
import behavioral.visitor.developers.JuniorDeveloper;
import behavioral.visitor.developers.SeniorDeveloper;
import behavioral.visitor.domain.Project;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new Project();

        Developer junior = new JuniorDeveloper();
        Developer senior = new SeniorDeveloper();

        System.out.println("Junior in action");
        project.beWritten(junior);

        System.out.println("\n=========================\n");

        System.out.println("Senior in action");
        project.beWritten(senior);
    }
}
