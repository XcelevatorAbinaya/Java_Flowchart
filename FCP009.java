import java.util.Scanner;
public class FCP009{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int A=sc.nextInt();
int B=sc.nextInt();

int d=A%B;
int c=A-d;

System.out.println(c);

}
}


