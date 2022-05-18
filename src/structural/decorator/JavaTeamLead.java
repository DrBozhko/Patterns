package structural.decorator;

public class JavaTeamLead extends DeveloperDecorator{
    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String groupTeam() {
        return "Group team... ";
    }

    @Override
    public String makeJob() {
        return super.makeJob() + groupTeam();
    }
}
