import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    Scanner in=new Scanner(System.in);
        int n=in.nextInt();
      int i=0;
      for(i=1;i<=n+n;i++)
      {
		if(i%2==1)
          System.out.println(i);
      }
	}
}