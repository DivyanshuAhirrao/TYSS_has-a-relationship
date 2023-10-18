package assignments.has_a_relationship.p9;

public class MainApp {
    public static void main(String[] args) {
        Team team = new Team("Alpha",150,"FireFlink",new TeamLead("TestYantra",101));

        System.out.println(team.getTeamName()+" \n "+ team.getProjectName()+" \n "+team.getNumMembers());
        team.getTeamLead().teamLeadDetails();
    }
}
