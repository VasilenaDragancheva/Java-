import java.util.Scanner;

/**
 * Created by bacuty on 15.10.2015 ?..
 */
public class _09HitThetarget {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number=scanner.nextInt();
        for(int i=1;i<=20;i++){
            for(int m=1;m<=20;m++){
                if(i+m==number){
                    System.out.println(String.format("%d + %d = %d",i,m,number));
                }
                if(i-m==number){
                    System.out.println(String.format("%d + %d = %d",i,m,number));
                }
            }
        }
    }
}
