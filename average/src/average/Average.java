package average;

public class Average {
	public static double avg(int[] n)
	{
		int a= n.length;
		int sum=0;
		for(int i=0;i<n.length;i++)
		{
			sum=sum+n[i];
		}
		return sum/a;
	}
	public static void main(String[]args)
	{
		int n[]= {85, 79, 91, 76, 88, 95, 80, 85};
		System.out.printf("%.2f",avg(n));
	}

}
