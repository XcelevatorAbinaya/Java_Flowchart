import java.util.Scanner;
public class FCP005{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the First number:");
int a=sc.nextInt();
System.out.println("Enter the second number");
int b=sc.nextInt();

int c=a/b;
int d=a%b;

System.out.println(c);
System.out.println(d);

}
}


