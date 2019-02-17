import java.util.Scanner;
class Main{
	public static void main (String[] args){
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      int a=n%10;
      int b=n/10;
      int c=b%10;
      int d=b/10;
      int s=d*d*d+c*c*c+a*a*a;
      if(s==n)
      System.out.println("Armstrong Number");
      else
      System.out.println("Not a Armstrong Number");
      
	}
}