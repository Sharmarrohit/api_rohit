package Org.testing.tc;

import static io.restassured.RestAssured.*;

import org.json.JSONObject;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class tc3postrequestM 

{
public static void main(String[] args)
{
	JSONObject inner=new JSONObject();
	inner.put("hno", "56");
	inner.put("sector", "7896");
	inner.put("land","HUDA");
	
JSONObject	outer=new JSONObject();
outer.put("firstname","rd shar");
outer.put("lastname","sharma");
outer.put("designation","QA");
outer.put("id","985463rohgf");
outer.put("address", inner);

Response rohit=
given()
.contentType(ContentType.JSON)
.body(outer.toString())
.when()
.post("  http://localhost:3000/seleniumStudent");
System.out.println("status code is");
System.out.println(rohit.statusCode());
}

}

