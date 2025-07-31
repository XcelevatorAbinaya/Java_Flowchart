import java.util.Scanner;
public class FCP003{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the first number:");
int a=sc.nextInt();
System.out.println("Enter the second number");
int b=sc.nextInt();

int temp;

temp=a;
a=b;
b=temp;

System.out.println(a);
System.out.println(b);

}}