public class Test28
{
 public static void main(String [] args)
 {
  Scanner s=new Scanner(System.in);
  String str=s.next();
  int charcount=0,numcount=0,othercount=0;
  for(int i=0;i<str.length();i++)
  {
     if(charAt(i)>='a' && charAt(i)=<'z')
      {
      charcount++;
      }
     elseif(charAt(i)>='A' && charAt(i)=<'Z') 
      {
      charcount++;
      }
      elseif(charAt(i)>='0' && charAt(i)=<'9') 
      {
      numcount++;
      }
      else
      {
       othercount++;
      }
  }
System.out.println("charcount"+ charcount++);
System.out.println("numcount"+ numcount++);
System.out.println("othercount"+ othercount++);
}}
