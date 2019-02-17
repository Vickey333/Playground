import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
      int n=in.nextInt();
      root(n);
      System.out.println(root(n));
	} 
  public static int root(int n)
  {
	int s=n*n;
    return s;
    
  }
}