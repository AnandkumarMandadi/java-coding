package thedoubletrouble;
import java.util.*;

public class DoubleTrouble {
	public static int doubleTrouble(int num)
	{
		return num*2;
	}
	public static void main(String[]args)
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter the number:");
		int num1=sc.nextInt();
		System.out.println(doubleTrouble(num1));
	}

}
