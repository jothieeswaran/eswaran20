import java.util.*;
public class Testr13
{
public Static void main(String[] args)
{
Scanner s=new Scanner(System.in)
int n=s.nextInt();
  int Flag=0;
  for(int i=2;i<n;i++)
  {
if(n%i==0)
{
System.out.println(" NOT A PRIME NUMBER");
  Flag=1;
  break;
}
  }
if(Flag=0)
{
System.out.println("PRIME");
}


}}
