import java.util.Scanner;
class Main {
	public static void main (String[] args){
	Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=n/10000;
      int b=n%10;
      int c=n/100;
      int d=c%10;
      int e=n%100;
      int f=e/10;
      int g=c%100;
      int h=g/10;
      int sum=a+b+d+f+h;
      System.out.println(sum);
 


	}
}