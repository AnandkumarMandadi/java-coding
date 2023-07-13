package satueday;

import java.util.Scanner;

public class GalacitiArithemetric {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		long num1= sc.nextLong();
		long num2=sc.nextLong();
		long ans=galaticaddition(num1,num1);
		System.out.print(ans);

	}
   public static long galaticaddition(long num1,long num2)
   {
	   return num1+num2;
   }
}
