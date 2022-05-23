import java.util.*;
public class Integer
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		TreeSet ts=new TreeSet();
		System.out.println("Enter the number of integers: ");
		int n=sc.nextInt();
		System.out.println("Enter the integer of your choice: ");
		for(int i=0; i<=n; i++)
		{
			ts.add(sc.next());
		}
		System.out.println("The entered integers are: "+ts);
		}
}

