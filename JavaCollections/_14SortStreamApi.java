import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by bacuty on 23.10.2015 ?..
 */
public class _14SortStreamApi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] line = scanner.nextLine().split(" ");
        String type = scanner.nextLine();
        int[] numbers = new int[line.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(line[i]);
        }
        numbers=Arrays.stream(numbers).sorted().toArray();
        if(type.toLowerCase().equals("ascending")){
            for(int i=0;i<numbers.length;i++){
                System.out.print(numbers[i]+" ");
            }
        }
        if(type.toLowerCase().equals("descending")){
            for(int i=numbers.length-1;i>=0;i--){
                System.out.print(numbers[i]+" ");
            }
        }

    }
}
