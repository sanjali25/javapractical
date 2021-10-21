import java.util.*;
class Arrayodd
{
public static void main(String args[])
{
int n,i;
Scanner sc=new Scanner(System.in);
System.out.println("\n enter size in array");
n=sc.nextInt();
int a[]=new int[n];
System.out.println("enter elements in array=");
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
for(i=0;i<n;i++)
{
if(a[i]%2==1)
System.out.println("number is odd");
else
System.out.println("numbr is even");
}
}
}