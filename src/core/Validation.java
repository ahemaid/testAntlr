package core;

import java.util.ArrayList;
import java.util.Iterator;


public class Validation {
	
	String process (String input, ArrayList<String> errors ) {
		
		String output= "";
		//System.out.print("\nInside validation\n"+input);

		
		Iterator<String> iterator = errors.iterator();
		while (iterator.hasNext()) {
		String line = iterator.next();
		String lineNum = line.split("line ")[1].split(":")[0];
		String columnNum = line.split("line ")[1].split(":")[1].split("")[0];

		//String line = temp.split(":")[0];
		System.out.print("\nline "+lineNum);
		System.out.print("\ncolumn "+columnNum);
		System.out.print("\nline "+line);


		}
		
		return output;
		
	}

}
