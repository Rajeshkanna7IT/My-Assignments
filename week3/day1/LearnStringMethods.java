package week3.day1;
import java.util.Arrays;
public class LearnStringMethods {

	public static void main(String[] args) {
		
		//initialization
		String comName="Test leaf";
		String name=new String("");
		
		//compare 2 strings
		if(comName.equals(name))
		{
			System.out.println("match");
		}
			else
			{
			System.out.println("No match");
			}
		

String name1="Selenium";
char[] ch=name1.toCharArray();

for( int i=ch.length-1; i>=0;i--)
    {
	System.out.println(ch[i]);
	}
}
}