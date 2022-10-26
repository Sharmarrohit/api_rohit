package Org.testing.tc;

import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class Test_case4postbypojo
{

	public static void main(String[] args)
	{
		addressinfo[] address=new addressinfo[2];
		address[0]=new addressinfo();
		address[0].setSector("sector 17");
		address[0].setHousnumber("3674");
		address[0].setGalino("97");
		
		address[1]=new addressinfo();
		address[1].setSector("secound adress sector 17");
		address[1].setHousnumber("j3674");
		address[1].setGalino("g97");
		
		
		B_info b=new B_info();
		b.setFirstname("Rohiti");
		b.setLastname("sharm");
		b.setID("d1vy5hhffr4455rrhfggg67");
		b.setAge("56");
		b.setDesignation("LEad");
		b.setAddress(address);
		
		
		Response res=
		given()
		.contentType(ContentType.JSON)
		.body(b)
		.when()
		.post(" http://localhost:3000/seleniumStudent");
		
		System.out.println("status code");
	    System.out.println(res.statusCode());
		
	}
}
