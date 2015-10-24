import java.util.ArrayList;
import java.util.Scanner;

public class _04LongestIncreasingSequence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");
        Integer[] numbers=new Integer[input.length];
        ArrayList<Integer> longestSequence=new ArrayList<Integer>();
        ArrayList<Integer> currentSeqence=new ArrayList<Integer>();
        for(int i =0;i<input.length;i++){
            numbers[i]=Integer.parseInt(input[i]);
        }
        for(int i=0;i<numbers.length;i++){
            currentSeqence.add(numbers[i]);
            int next=i+1;
            while(next<numbers.length&&numbers[next]>numbers[i]){
                currentSeqence.add(numbers[next]);
                next++;
                i++;
            }
            if(currentSeqence.size()>longestSequence.size()){
                longestSequence=(ArrayList<Integer>)currentSeqence.clone();
            }
            System.out.println(currentSeqence);
            currentSeqence.clear();

        }
        System.out.print("Longest sequence :"+longestSequence);
    }
}
