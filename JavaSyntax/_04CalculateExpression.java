import java.util.Scanner;

public class _04CalculateExpression {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        double a=scanner.nextDouble();
        double b=scanner.nextDouble();
        double c=scanner.nextDouble();
        double f1=firstExpression(a, b, c);
        double f2=secondExpression(a,b,c);
        double averageF=(f1+f2)/2;
        double averageNum=(a+b+c)/3;
        double diff=averageF-averageNum;
        System.out.printf("F1 is %.2f,F2 is %.2f, and diff is %.2f",f1,f2,diff);


    }
    private  static  double firstExpression(double a,double b,double c){
        double f1=0;
        //((a2 + b2) / (a2 – b2))(a + b + c) / ?c             ((a2 + b2) / (a2 – b2))(a + b + c) / ?c
        f1=Math.pow(a,2)+Math.pow(b,2);
        f1/=(Math.pow(a,2)-Math.pow(b,2));
        f1=Math.pow(f1,(a+b+c)/Math.sqrt(c));

        return  f1;
    }
    private  static  double secondExpression(double a,double b,double c){
        double f2=0;
        f2=Math.pow(a,2)+Math.pow(b,2)-Math.pow(c,3);
        f2=Math.pow(f2,a-b);

        return f2;
    }
}
