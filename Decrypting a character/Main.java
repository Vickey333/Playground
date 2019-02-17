import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
       Scanner in=new Scanner(System.in);
      char ch=in.next().charAt(0);
      int n=in.nextInt();
      if((ch>='a')&&(ch<='z'))
      {
        ch=(char)(ch+23);
      }
      else if((ch>='A' && ch<='Z'))
      {
        ch=(char)(ch-2);
     
      }
       System.out.println(ch);
      
    }
}
