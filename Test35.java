import java.util.*;
public class Test35
{
public static void main(String ar[])
{
int a=0,b=0,c=0;
Scanner s=new Scanner(System.in);
String a=s.next();
int b[]=new Integer(a.length());
 for(int i=0;i<a.length();i++)
 {
    b[i]=Integer.parseInt(String.valueOf[a.charAt(i)]);   
 }
      Arrays.sort(b);
      System.out.println(b[a.length()-1]);   
   
    }}
