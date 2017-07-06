# camel
import java.io.*;
import java.util.*;
public class Camelcase
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner (System.in);
    System.out.println("Enter the string");
    String str=sc.nextLine();
    String x="";
    char y=str.charAt(0);
    x=x+Character.toUpperCase(y);
    for(int i=1;i<str.length();i++)
    {
      char c=str.charAt(i);
      char p=str.charAt(i-1);
      if(p == ' ')
      {
        x=x+Character.toUpperCase(c);
      }
      else
      {
        x=x+c;
      }
    }
    System.out.print(x);
  }
}
