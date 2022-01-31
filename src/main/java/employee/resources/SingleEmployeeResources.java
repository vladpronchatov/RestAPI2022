package employee.resources;

import io.restassured.response.Response;
import org.testng.Assert;

import static io.restassured.RestAssured.given;

public class SingleEmployeeResources {

    String baseUrl = "http://info.venturepulse.org:8080/service-webapp";

    public void getValidSingleEmployeeResources(){
        Response response = given().when().get(baseUrl+"/api/SingleEmployeeResources/590a4acd35522970c7956cdf").then().statusCode(200)
                .extract().response();
        int statusCode = response.getStatusCode();
        String statusLine = response.getStatusLine();
        response.getBody().prettyPrint();
        Assert.assertEquals(statusCode, 200);
        Assert.assertEquals(statusLine,statusLine);
    }

    public void getInValidSingleEmployeeResources(){
        Response response = given().when().get(baseUrl+"/api/SingleEmployeeResources/590a4acd35522970c7956cdf/dummy").then().statusCode(404)
                .extract().response();
        int statusCode = response.getStatusCode();
        String statusLine = response.getStatusLine();
        response.getBody().prettyPrint();
        Assert.assertEquals(statusCode, 404);
        Assert.assertEquals(statusLine,statusLine);
    }
}
