import java.util.*;
import java.util.Scanner;
public class LCM {
    private static int gcdFast(int x, int y) {
        if (y <= 0)
            return x;
        return gcdFast(y, x % y);
    }
    private static int lcmfast(int x,int y)
    {
        int gcd = gcdFast(x,y);
        return (x*y)/gcd;
    }

  public static void main(String args[]) {
      Scanner scanner = new Scanner(System.in);
      int x = scanner.nextInt();
      int y = scanner.nextInt();
      System.out.print(lcmfast(x,y));
  }
}
