import java.util.*;
public class Test33
{
public static void main(String ar[])
{
int a=0,b=0;

Scanner sc=new Scanner(System.in);
a=sc.next();
b=sc.next();
     System.out.println(a+"    "+b);

     a=a^b;
     b=a^b;
     a=a^b;
System.out.println(a+"      "+b);
}}
