package WorkFlows;

import Extensions.apiActions;
import Extensions.uiActions;
import Utilities.CommonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class apiFlows extends CommonOps
{
    @Step("Get Team From Grafana flow")
    public static String getTeamProperty(String jPath, String recordID)
    {
        Response response = apiActions.get("/api/teams/search");
        return apiActions.getFromJson(response, jPath, recordID);
    }

    @Step("Post Team to Grafana")
    public static void postTeam(String name, String email)
    {
        requestParams.put("name", name);
        requestParams.put("email", email);
        apiActions.postToServer(requestParams, "/api/teams");
    }

    @Step("Update Team in Grafana")
    public static void updateTeam(String name, String email, String id)
    {
        requestParams.put("name", name);
        requestParams.put("email", email);
        apiActions.updateInServer(requestParams, "/api/teams/" +id);
    }

    @Step("Delete Team from Grafana")
    public static void deleteTeam(String id)
    {
        apiActions.DeleteFromServer(id);
    }

    @Step("Get empty Teams list from Grafana")
    public static String getEmptyTeams(String jPath)
    {
        Response response = apiActions.get("/api/teams/search");
        return apiActions.GetEmpty(response, jPath);
    }
}
