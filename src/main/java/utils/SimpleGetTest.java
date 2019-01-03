package utils;

import org.junit.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
 
public class SimpleGetTest {
 
 @Test
 public void GetWeatherDetails()
 {   
 // Specify the base URL to the RESTful web service
 RestAssured.baseURI = "http://restapi.demoqa.com/utilities/weather/city";
 
 // Get the RequestSpecification of the request that you want to sent
 // to the server. The server is specified by the BaseURI that we have
 // specified in the above step.
 RequestSpecification httpRequest = RestAssured.given();
 
 // Make a request to the server 
 // This will return the Response from the server. Store the response in a variable.
 Response response = httpRequest.request(Method.GET, "/Hyderabad");
 
 // Now let us print the body of the message to see what response
 // we have recieved from the server
 String responseBody = response.getBody().asString();
 System.out.println("Response Body is =>  " + responseBody);
 
 }
 
}
