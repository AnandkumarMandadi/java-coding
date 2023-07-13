package cudenum;

import java.util.Scanner;

public class CudeNum {
	public static int cubeNumber(int num) {
		return num*num*num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n= sc.nextInt();
		System.out.println(cubeNumber(n));
		sc.close();

	}

}
