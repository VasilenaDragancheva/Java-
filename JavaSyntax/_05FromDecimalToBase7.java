import java.util.Scanner;

public class _05FromDecimalToBase7 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        String result=Integer.toString(number,7);
        System.out.println(result);
    }
}
