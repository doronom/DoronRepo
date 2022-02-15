package Helpers;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;
import org.json.simple.JSONObject;

public class temp
{
    public String url = "http://localhost:3000";
    public RequestSpecification httpRequest;
    public Response response;

    @Test
    public void restTesting()
    {
        RestAssured.baseURI = url;
        httpRequest = RestAssured.given().auth().preemptive().basic("admin", "admin");
        JSONObject params = new JSONObject();
        params.put("name", "DoronO");
        params.put("email", "DoronO@gmail123.com");


       // httpRequest.header("Content-Type", "Application/json");
        //httpRequest.body(params.toJSONString());
        //response = httpRequest.post("/api/teams");
        //response = httpRequest.put("/api/teams/2");
        //response = httpRequest.delete("/api/teams/2");
        response = httpRequest.get("/api/teams/search?perpage=50&page=1");
        JsonPath jp = response.jsonPath();
        String id = jp.get("teams[0].id").toString();
        System.out.println(id);
        System.out.println(response.prettyPrint());
    }

}
