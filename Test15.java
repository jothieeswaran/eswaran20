import java.util.Scanner;

public class gtd {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int b=s.nextInt();
		for(int i=2;i<b;i++)
		{
			if(b%i==0)
			{
				System.out.println(b);
			}
		}
	}

}
