import java.util.Scanner;

public class _03FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        float b=scanner.nextFloat();
        float c=scanner.nextFloat();
        System.out.printf("|%-10x|%s|%10.2f|%-10.3f|", a,String.format ("%10s",Integer.toBinaryString(a)).replace(' ','0'), b, c);
    }
}
