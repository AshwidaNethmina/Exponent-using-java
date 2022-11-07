import java.util.Scanner;

public class exponent
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n--This program calculates exponent--\nEnter the base: ");
		int b = sc.nextInt();
		System.out.print("\nEnter the index: ");
		int i = sc.nextInt();
		System.out.print("\n"+b+" to the power "+i+" is: "+power(b, i)+"\n");
	}
	
	static int power(int base, int index)
	{
		if(index == 0)
			return 1;
		else if(index == 1)
				return base;
			else
				return base*power(base, index-1);
	}
}