package Org.testing.tc;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class get_tc1 
{
public static void main(String[] args) 
{

	Response rohit=
	given()
	.contentType(ContentType.JSON)
	.when()
	.get("  http://localhost:3000/seleniumStudent");
System.out.println("status code is");
System.out.println(rohit.statusCode());
System.out.println("responce datais ");
System.out.println(rohit.asString());
}
}
