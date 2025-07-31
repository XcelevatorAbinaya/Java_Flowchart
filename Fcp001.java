import java.util.Scanner;
public class Fcp001{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the birth date");
int date=sc.nextInt();
System.out.println("Enter the birth month");
sc.nextLine();
String month=sc.nextLine();

System.out.println("Enter the birth year");
int year=sc.nextInt();

System.out.println(date);
System.out.println(month);
System.out.println(year);
}
}
