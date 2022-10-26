package Org.testing.tc;

import static io.restassured.RestAssured.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class tc2postRequestM 
{
public static void main(String[] args) throws FileNotFoundException
{

	File f=new File("../apirohit/target/bodyData.json");
	FileReader fr=new FileReader(f);
	JSONTokener j=new JSONTokener(fr);
	JSONObject js=new JSONObject(j);
	
	Response rohit=
			given()
			.contentType(ContentType.JSON)
			.body(js.toString())
			.when()
			.post("  http://localhost:3000/seleniumStudent");
		System.out.println("status code is");
		System.out.println(rohit.statusCode());
}

	
	
}
