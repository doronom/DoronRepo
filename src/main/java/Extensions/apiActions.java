package Extensions;

import Utilities.CommonOps;
import io.qameta.allure.Step;
import io.restassured.response.Response;
import org.json.simple.JSONObject;

public class apiActions extends CommonOps
{
    //Get raw data from Rest API server
    @Step("Get data from server ")
    public static Response get(String paramsValues)
    {
        response = httpRequest.get(paramsValues);
        System.out.println(response.prettyPrint());
        return response;
    }
    //Parsing the rew data to Json format
    @Step("Extract value from Json format ")
    public static String getFromJson(Response response, String path, String recordID)
    {
        jp = response.jsonPath();
        System.out.println(response.getBody().prettyPrint());
        apiID = jp.get(recordID).toString();
        System.out.println(apiID);
        return jp.get(path).toString();
    }

    //Adding data to Rest API server
    @Step("Post data to server")
    public static void postToServer(JSONObject params, String JsonIndex)
    {
        httpRequest.header("Content-Type", "Application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.post(JsonIndex);
        System.out.println(response.prettyPrint());
    }

    //Update data in Rest API server
    @Step("Update data in server")
    public static void updateInServer(JSONObject params, String JsonIndex)
    {
        httpRequest.header("Content-Type", "Application/json");
        httpRequest.body(params.toJSONString());
        response = httpRequest.put(JsonIndex);
        System.out.println(response.prettyPrint());
    }
    //Delete data from Rest API server
    @Step("Delete data from server")
    public static void DeleteFromServer(String id)
    {
        response = httpRequest.delete("/api/teams/" + id);
        System.out.println(response.prettyPrint());
    }
    //Verify that the data in the server deleted
    @Step("Get empty list")
    public static String GetEmpty(Response response, String path)
    {
        jp = response.jsonPath();
        System.out.println(response.getBody().prettyPrint());
        return jp.get(path).toString();
    }
}
