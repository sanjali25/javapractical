import java.util.*;
class Arraydemo
{
public static void main(String args[])
{
int arr[]=new int[5];
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of an array");
for(int i=0;i<5;i++)
arr[i]=sc.nextInt();
System.out.println("Display  the value of an array");
for(int i=0;i<5;i++)
System.out.println("value of arr" + "["+i+"]" +arr[i]);
}
}