package SanityTests;

import Extensions.verifications;
import Utilities.CommonOps;
import WorkFlows.apiFlows;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class grafanaAPI extends CommonOps
{
    /*
    @Test(description = "Test 01: Get team from Grafana")
    @Description("Test Description: Login to Grafana and get team")
    public void Test01_getTeam()
    {
        verifications.text(apiFlows.getTeamProperty("teams[0].name"), "Doron");
    }
*/
    @Test(description = "Test 01: Post teams to Grafana and verify")
    @Description("Test Description: Post new team to Grafana and verify it")
    public void Test01_postTeam()
    {
        apiFlows.postTeam(getData("teamName"),getData("teamEmail"));
        verifications.text(apiFlows.getTeamProperty("teams[0].name", "teams[0].id"), "AutomationQA");
    }

    @Test(description = "Test 02: Update teams value in Grafana and verify")
    @Description("Test Description: Update exist team in Grafana and verify it")
    public void Test02_updateTeam()
    {
        apiFlows.updateTeam(getData("updateTeamName"),getData("teamEmail"), apiID);
        verifications.text(apiFlows.getTeamProperty("teams[0].name", "teams[0].id"), "MyTeam");
    }

    @Test(description = "Test 03: Delete teams from Grafana and verify")
    @Description("Test Description: Delete team from Grafana")
    public void Test03_deleteTeam()
    {
        apiFlows.deleteTeam(apiID);
        verifications.text(apiFlows.getEmptyTeams("totalCount"), "0");
    }
}
