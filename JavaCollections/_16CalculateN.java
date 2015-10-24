import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by bacuty on 24.10.2015 ?..
 */
public class _16CalculateN {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        BigInteger factorialN=BigInteger.ONE;
        factorialN=RecursiveCalculation(n);
        System.out.print(factorialN);
    }

    private static BigInteger RecursiveCalculation(int n) {
        BigInteger result=BigInteger.ZERO;
        if(n==0||n==1){
            result=BigInteger.ONE;
        }else{
            result=RecursiveCalculation(n-1).multiply(BigInteger.valueOf(n));
        }
        return  result;

    }
}
