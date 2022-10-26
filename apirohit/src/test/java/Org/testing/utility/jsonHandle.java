package Org.testing.utility;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import org.json.JSONObject;
import org.json.JSONTokener;

public class jsonHandle
{
	public static String ReadJson(String jsonFilePath) throws FileNotFoundException
	{
		File r=new File(jsonFilePath);
		FileReader fr=new FileReader(r);
		JSONTokener j=new JSONTokener(fr);
		JSONObject js=new JSONObject(j);
		return js.toString();
	}

}
