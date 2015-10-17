import java.math.BigInteger;
import java.util.Scanner;


public class _01RectangleArea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        BigInteger area=BigInteger.valueOf(a).multiply(BigInteger.valueOf(b));
        //asuming a*b may throw exception
        scanner.close();
    }
}
