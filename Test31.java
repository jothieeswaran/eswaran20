import java.util.*;
public class Test30
{
public static void main(String ar[])
{
int a=0,b=0,c=0,d=0;
char ch;
Scanner sc=new Scanner(System.in);
String p=new String();
p=sc.next();
for(int i=0;i<p.length();i++)
{
ch=p.CharAt(i);
if(Character.isLetter(ch))
     {
     ++a;
     }
elseif(Character.isDigit(ch))
     {
     ++b;
      }     
elseif(ch=='  ')
     {
     ++c;
      }   
 else
     {
     ++d;
     }
}
System.out.println(d);
}}
