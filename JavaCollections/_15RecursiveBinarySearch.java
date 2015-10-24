import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by bacuty on 24.10.2015 ?..
 */
public class _15RecursiveBinarySearch {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String[] line=scanner.nextLine().split(" ");
        int searchedNumber=Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[line.length];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(line[i]);
        }
        numbers= Arrays.stream(numbers).sorted().toArray();
        int index=recursiveBinarySearch(numbers,0,numbers.length-1,searchedNumber);
        System.out.print(index);
    }

    private static int recursiveBinarySearch(int[] numbers,int start, int end, int searchedNumber) {
        int index=-1;
        if(start<end){
            int mid=(start+end)/2;
            int curNumber=numbers[mid];
            if(curNumber>searchedNumber){
                index=recursiveBinarySearch(numbers,start,mid-1,searchedNumber);
            }else if(curNumber<searchedNumber){
                index=recursiveBinarySearch(numbers,mid+1,end,searchedNumber);
            }
        }
        if(start==end){
            if(numbers[start]==searchedNumber){
                index=start;
            }
        }

        return index;
    }
}
