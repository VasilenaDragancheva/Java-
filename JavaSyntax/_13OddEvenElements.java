import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by bacuty on 16.10.2015 ?..
 */
public class _13OddEvenElements {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Integer> numbers=new ArrayList<Integer>();

        while(scanner.hasNextInt()){
            numbers.add(scanner.nextInt());
        }
        String command=scanner.next();
        int count=scanner.nextInt();
        String type=scanner.next();
        int countPrinted=0;
        ArrayList<Integer> result=returnedNumbers(numbers,count,type);
        System.out.print(result);

    }

    private static ArrayList<Integer> returnedNumbers(ArrayList<Integer> numbers, int count, String type) {

        ArrayList<Integer> result=new ArrayList<Integer>();
        for(int i=0;i<numbers.size();i++){
            int number=numbers.get(i);
            if(number%2==0&&type.equals("even")){
                result.add(number);
            }
            if(number%2==1&&type.equals("odd")){
                result.add(number);
            }
            if(count==result.size()){
                break;
            }
        }
        return  result;
    }
}
