package problems;

import java.io.*;
import java.util.*;

public class JavaStringTokens {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.nextLine();
		String regex = "^\\s+";
		String trim = s.replaceAll(regex, "");
		
		if (trim.equals("")) {
			System.out.println("0");
		}else {
			String[] result = trim.split("[ !,?._'@]+");
			
			System.out.println(result.length);
			for (String a : result) {
				System.out.println(a);
			}

			scan.close();
			
		}
		
	}

}
