//palindrome or not 
import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
String n=sc.nextLine();
String rev="";
for(int i=n.length()-1;i>=0;i--)
{
rev=rev+n.charAt(i);
}
if(n.equals(rev))
{
System.out.println("Equal");
}
else
{
System.out.println("Not equal");
}
}
}
//Rightangle triangle
import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
for(int i=1;i<=n;i++)
{
for(int j=1;j<=i;j++)
{
System.out.print("*");
}
System.out.println();
}
}
}
// Electricity bill
import java.util.*;
class Main
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int bill=sc.nextInt();
if(bill==250)
{
System.out.println("No amount to pay");
}
else if(bill>250 && bill<=350)
{
System.out.println("Amount to pay is 100");
}
else
{
int amount=bill*2;
System.out.println("Amount to pay is "+amount);
}
}
}