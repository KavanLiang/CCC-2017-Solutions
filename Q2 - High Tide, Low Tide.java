import java.util.*;
public class Main
{
	
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int N = Integer.valueOf(sc.nextLine());
		String[] tideStrings = sc.nextLine().split(" ");
		LinkedList<Integer> tides = new LinkedList<>();
		for(int i = 0; i < tideStrings.length; i++)
			tides.add(Integer.valueOf(tideStrings[i]));
		Collections.sort(tides);
		LinkedList<Integer> sortedTides = new LinkedList<>();
		int toggle = 0;
		if(tides.size() %2 != 0)
			toggle = 1;
		while(!tides.isEmpty())
		{
			if(toggle%2 == 1)
				sortedTides.addFirst(tides.removeFirst());
			else
				sortedTides.addFirst(tides.removeLast());
			toggle++;
		}
		for(int i = 0; i < sortedTides.size(); i++)
			System.out.print(sortedTides.get(i) + " ");
	}
}
