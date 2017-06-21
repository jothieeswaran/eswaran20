import java.util.*;
public class Test10
{
public static void main(String[] args)
{
Scanner s=new Scanner(System.in);
int a,n,sum=0;
int n=s.nextInt();
while(n>0)
{
 a=n%10;
 sum=sum+a;
 n=n/10;
 }
 System.out.println(sum);
 }}
