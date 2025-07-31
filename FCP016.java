import java.util.Scanner;
public class FCP016{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
if(a%4==0){
System.out.println("It is leap Year");
}
else if(a%100==0){
System.out.println("Not a leap year");
}
else if(a%400==0){
System.out.println("It is leap year");
}
else{
System.out.println("Not a leap year");
}
}
}
