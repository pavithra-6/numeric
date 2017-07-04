package sumave1;
import java.util.Scanner;
public class Numericcount {

	public static void main(String args[])  {
		String s;
		int count=0;
		char ch;
		System.out.println("enter the string");
		Scanner sc=new Scanner(System.in);
		s=sc.nextLine();
		int length=s.length();
		for(int i=0;i<length;i++){
			if(Character.isDigit(s.charAt(i))){
				count++;
		}
		}
	
System.out.println(count);
	}

}
