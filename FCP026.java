import java.util.Scanner;
public class FCP026{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
int M=sc.nextInt();
int N=sc.nextInt();
int sum=0;

while(M<=N){
sum+=M;
M++;

}
System.out.println(sum);
}
}
