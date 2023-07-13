package Squarenum;

import java.util.Scanner;

public class SquareNum {
	public static int squarenum(int n)
	{
		return n*n;
	}
	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		System.out.print(squarenum(n));
		sc.close();
	}

}
