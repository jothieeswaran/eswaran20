import java.util.Scanner;

public class t17 {
	public static void main(String[] args)
	{
	  Scanner s=new Scanner(System.in);
	  int n=s.nextInt();
      int c=0; int b=0;int temp=0;
      temp=n;
      for(int i=1;i<n;i++)
      {
    	  c=i%10;
    	  b=b+(c*c*c);
    	  n=n/10;
	 System.out.println(b)  ;     
      }
      if(temp==b)
      {
    	System.out.println("ARMSTRONG NUMBER")  ;
    	
      }
      else
      {
    	  System.out.println(" NOT A ARMSTRONG NUMBER")  ;  
      }
}}
