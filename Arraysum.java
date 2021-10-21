import java.util.*;
class Arraysum
{
public static void main(String args[])
{
int sum=0;
float avg;
int a[]=new int[10];
Scanner sc=new Scanner(System.in);
System.out.println("\n enter the value of an array=");
for(int i=0;i<10;i++)
{
a[i]=sc.nextInt();
sum+=a[i];
}
avg=(float)sum/10;
System.out.println("\n the given array is=");
for(int i=0;i<10;i++)
{
System.out.println("\t" +a[i]);
}
System.out.println("\n sum of given array="+sum);
System.out.println("\n average of given array="+avg);
}
}