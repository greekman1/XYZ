import EchoApp.EchoPOA;
import java.util.*;  
public class EchoServer extends EchoPOA {
    @Override
    public String echoString() { 
	Scanner sc= new Scanner(System.in); //System.in is a standard input stream  
	System.out.print("Enter a string: ");  
	String str= sc.nextLine();
	String str1=str.toLowerCase();
	String str2=str.toUpperCase();        //reads string   
        return str1;
     
       // System.out.println("string length is: "+str.length());
    }
}
