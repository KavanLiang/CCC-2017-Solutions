import java.util.*;
public class Main
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int n = Integer.valueOf(sc.nextLine());
		String[] first = sc.nextLine().split(" ");
		String[] second = sc.nextLine().split(" ");
		int sum1 = 0;
		int sum2 = 0;
		int maxIndex = 0;
		for(int i = 0; i < first.length; i++)
		{
			sum1 += Integer.valueOf(first[i]);
			sum2 += Integer.valueOf(second[i]);
			if(sum1 == sum2)
			{
				maxIndex = i + 1;
			}
		}
		System.out.println(maxIndex);
	}
}
