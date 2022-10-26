package Org.testing.testCase;

import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

import Org.testing.testScript.HTTPMethord;
import Org.testing.utility.jsonHandle;
import Org.testing.utility.propertieshandlie;

public class tc3_getrequest

{
@Test
	public void testcase1() throws IOException
	{
	
		Properties pr=propertieshandlie.readpropertyfile("../apirohit/URI.properties");
		String bodyData=jsonHandle.ReadJson("../apirohit/src/test/java/Org/testing/resources/inpurpayload.json");		
		HTTPMethord http=new HTTPMethord(pr);
		http.PostMethod(bodyData, "Qa_URI_selenium");
	}
}
