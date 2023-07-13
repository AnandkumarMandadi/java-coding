package journeyCalculater;

import java.util.Scanner;

class JourneyCalculator {
	public void ans(double speed,double time)
	{
	    double ans=speed*time;
		System.out.printf("%.2f",ans);
	}

}
class Calculator{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		double speed=sc.nextDouble();
		double time=sc.nextDouble();
		JourneyCalculator j=new JourneyCalculator();
		j.ans(speed, time);
		//System.out.printf("%2.f",ans);
	}
}