import java.util.Scanner;

public class Frog
{
	public static void main(String [] args)
	{
		Scanner s = new Scanner(System.in);

		System.out.println("What is the Distance?");
		int distance = s.nextInt();

		int rest = restTaken(distance);
		System.out.println("To complete " +distance+ " m Frog will take " +rest+ " Second(s) rest.");	

	}
	
	static int restTaken(int distance)
	{
			int totaldistance = 0;
			int rest = 0;

		for(int i=0;totaldistance<=distance;i++)
		{
			if(totaldistance>0)
			{
				rest=rest+1;	
			}
			totaldistance=totaldistance+5;	
			

			if(totaldistance<distance)
			{
				rest=rest+2;
				totaldistance=totaldistance+3;
			}
			

			if(totaldistance<distance)
			{
				rest=rest+3;
				totaldistance=totaldistance+1;
			}
		}
		return rest;	
	}		

}