package prg44.samplejson5;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class ReadJSON {

	public static void main (String[] args) throws IOException, ParseException, org.json.simple.parser.ParseException{



		JSONParser jsonparser = new JSONParser();
		FileReader reader = new FileReader (".\\JSON\\prg44.json");

		Object obj = jsonparser.parse (reader);
		JSONObject studentobj = (JSONObject) obj;

		String fname = (String) studentobj.get ("FirstName");
		String lname = (String) studentobj.get ("LastName");

		System.out.println("FirstName:"+fname);
		System.out.println ("LastName:"+lname);
		}}
