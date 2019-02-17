import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
      int x=in.nextInt();
      int y=in.nextInt();
      power(x,y);
      System.out.println(power(x,y));
	} 
  public static int power(int x,int y)
  {
	if (y == 0) 
            return 1; 
        else if (y % 2 == 0) 
            return power(x, y / 2) * power(x, y / 2); 
        else
            return x * power(x, y / 2) * power(x, y / 2); 
    
  }
}