package Org.testing.testScript;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class HTTPMethord 
{
	Properties pr;
	public HTTPMethord(Properties pr)
	{
		this.pr=pr;
	}

	public void PostMethod(String bodyData,String uriKey)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(bodyData)
		.when()
		.post(pr.getProperty(uriKey));
		System.out.println("Status code is ");
		System.out.println(res.statusCode());
	}
	
	public void GetAllMethod(String uriKey)
	{
		Response res=
		given()
		.contentType(ContentType.JSON)
		.when()
		.get(pr.getProperty(uriKey));
		System.out.println("Status code is ");
		System.out.println(res.statusCode());
		System.out.println("response data");
		System.out.println(res.asString());
	}
}
