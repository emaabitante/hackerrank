package problems;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
// https://stackoverflow.com/questions/9379426/java-when-is-a-static-initialization-block-useful
public class JavaStaticInitializerBlock {
	 
	public static Scanner in = new Scanner(System.in);
	public static final int B = in.nextInt();
	public static final int H = in.nextInt();
	public static boolean flag = true;
	
	static {
		if (B <= 0 || H <= 0) {
			System.err.println("java.lang.Exception: Breadth and height must be positive");
			flag = false;
		}
	}
		 

	public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

