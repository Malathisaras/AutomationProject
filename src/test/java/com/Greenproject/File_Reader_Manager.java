package com.Greenproject;

import com.helper.Config_Reader;
import com.helper.Configuration_Reader;

public class File_Reader_Manager {
private File_Reader_Manager()
{
	
}
public static File_Reader_Manager getInstanceFRM()
{
	File_Reader_Manager reader=new File_Reader_Manager();
	return reader;
}
public Configuration_Reader getInstanceCR() throws Throwable {
	Configuration_Reader reader=new Configuration_Reader();
return reader;
}
public Config_Reader getConfigReader() throws Throwable
{
	Config_Reader reader1=new Config_Reader();
	return reader1;
}
}
