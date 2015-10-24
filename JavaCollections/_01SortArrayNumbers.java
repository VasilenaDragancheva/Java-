import java.util.Arrays;
import java.util.Scanner;


public class _01SortArrayNumbers {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n=Integer.parseInt(scanner.next());
        Integer[] numbers=new Integer[n];

        for(int i =0;i<n;i++){
            numbers[i]=scanner.nextInt();
        }
        Arrays.sort(numbers);
        System.out.println(Arrays.asList(numbers));
    }
}
