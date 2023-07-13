package temperature;

import java.util.Scanner;

public  class TemperatureConvertor {
	public static double ToCelsius(double fahrenheit)
	{
		double ans=(fahrenheit-32)*5/9;
		return ans;
	}
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		double f= sc.nextDouble();
		System.out.printf("%.2f",ToCelsius(f));
	}

}
