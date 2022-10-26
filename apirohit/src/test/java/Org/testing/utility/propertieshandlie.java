package Org.testing.utility;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class propertieshandlie 
{
public static Properties readpropertyfile(String filePath) throws IOException
{
	File f=new File(filePath);
	FileReader fr=new FileReader(f);
	Properties pr=new Properties();
	pr.load(fr);
	return pr;
	
	
}
}
