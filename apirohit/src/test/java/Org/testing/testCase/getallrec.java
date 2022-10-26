package Org.testing.testCase;

import java.io.IOException;
import java.util.Properties;

import Org.testing.testScript.HTTPMethord;
import Org.testing.utility.jsonHandle;
import Org.testing.utility.propertieshandlie;

public class getallrec 

{

	public void testcase2() throws IOException
	{
	
		Properties pr=propertieshandlie.readpropertyfile("../apirohit/URI.properties");	
		HTTPMethord http=new HTTPMethord(pr);
		http.GetAllMethod("Qa_URI_selenium");
}
}
