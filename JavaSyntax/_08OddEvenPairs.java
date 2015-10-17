import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bacuty on 15.10.2015 ?..
 */
public class _08OddEvenPairs {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<Integer>();
        while(!scanner.hasNext("end")){
            numbers.add(scanner.nextInt());
        }
        if(numbers.size()%2==1){
            System.out.println("Invalid length");
            return;
        }
        for(int i=0;i<numbers.size()-1;i+=2){
            boolean firstOdd=numbers.get(i)%2==1;
            boolean secondOdd=numbers.get(i+1)%2==1;
            if(firstOdd!=secondOdd){
                System.out.printf("%d, %d -> different",numbers.get(i),numbers.get(i+1));
            }else if(firstOdd==secondOdd&&firstOdd==false){
                System.out.printf("%d, %d -> both are even",numbers.get(i),numbers.get(i+1));
            }else{
                System.out.printf("%d, %d -> both are odd",numbers.get(i),numbers.get(i+1));
            }
            System.out.println();
        }
    }
}
