package assignments.has_a_relationship.p9;

public class Team {
    private String teamName;
    private int numMembers;
    private String projectName;
    private TeamLead teamLead;

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public int getNumMembers() {
        return numMembers;
    }

    public void setNumMembers(int numMembers) {
        this.numMembers = numMembers;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public TeamLead getTeamLead() {
        return teamLead;
    }

    public void setTeamLead(TeamLead teamLead) {
        this.teamLead = teamLead;
    }

    public Team(String teamName, int numMembers, String projectName, TeamLead teamLead) {
        this.teamName = teamName;
        this.numMembers = numMembers;
        this.projectName = projectName;
        this.teamLead = teamLead;
    }

    public Team() {
    }


}
