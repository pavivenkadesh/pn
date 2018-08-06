import java.io.*;
import java.util.*;
class Main
{
public static void main(String args[])
{
int n;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value");
n=sc.nextInt();
if(n>0)
System.out.println(n + "is possitive");
else if(n<0)
System.out.println(n + "is negative");
else
System.out.println("it is zero");
}
}
