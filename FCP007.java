import java.util.Scanner;
public class FCP007{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the temperature in fahrenheit:");
int celsius=sc.nextInt();

int fahrenheit=(9*celsius)/5+32;

System.out.println(fahrenheit);
}
}
