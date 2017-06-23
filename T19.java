import java.util.Scanner;

public class T19 {
	public static void main(String[] args)
	{
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
	  int fact=1;
	  for(int i=1;i<=n;i++){
		  if(n==0){
			  System.out.println("the value is zero");
		  }
		  else
		  {
			fact=fact*i;
			System.out.println(i);
		  }
	  }
	  
	  
	  
	  
	}}
