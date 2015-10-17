import java.util.Scanner;


public class _06FromBase7ToDecimal {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String inputNumber=scanner.next();
        int numberDecimal=Integer.valueOf(inputNumber,7);
        System.out.println(numberDecimal);
    }
}

