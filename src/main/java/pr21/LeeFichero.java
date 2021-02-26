package pr21;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
public class LeeFichero {

	public static List devuelvePropiedades()  {
		List<String> l=new ArrayList<String>();
		try {
		Properties props=new Properties();	
		props.load((new java.io.FileInputStream("src/main/java/pr21/misPropiedades.properties")));
		Enumeration pNames=props.propertyNames();
		while(pNames.hasMoreElements()) {
			String item=(String)pNames.nextElement();
			l.add(props.getProperty(item));
		}		
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		return l;
		
		
	}
}
