import java.util.*;

public class GCD {
    public static int getGCD (int x , int y)
    {
        int gcd=0;
        for(int i = 1 ; i <= x && i<=y ;i++)
        {
            if (x%i == 0 && y%i == 0)
            {
                
                if (i>gcd)
                {gcd=i;}
            }
        }
        return gcd;
    }
  public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      
      System.out.println(getGCD(x,y));
  }
}
