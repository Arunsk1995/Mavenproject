import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Sample1 {
    public static void main(String[] args) throws IOException, ParseException {
		FileReader reader = new FileReader("C:\\Users\\DELL\\eclipse-workspace\\ApiTest\\JsonFiles\\Emplyee.json");
		JSONParser jsonParser= new JSONParser();
		Object obj = jsonParser.parse(reader);
		JSONObject j= (JSONObject)obj;
		Object object = j.get("data");
		System.out.println(object);
	
		JSONObject jsondata=(JSONObject)object;
		Object object2 = jsondata.get("id");
		System.out.println(object2);
	   
		Object object3 = jsondata.get("email");
		System.out.println(object3);
		Object object4 = jsondata.get("first_name");
		System.out.println(object4);
		Object object5 = jsondata.get("last_name");
		System.out.println(object5);
		Object object6 = jsondata.get("avatar");
		System.out.println(object6);
		Object object7 = j.get("support");
		System.out.println(object7);
		JSONObject jssupport = (JSONObject)object7;
		Object object8 = jssupport.get("text");
		System.out.println(object8);
		Object object9 = jssupport.get("url");
		System.out.println(object9);
	

	}
}
