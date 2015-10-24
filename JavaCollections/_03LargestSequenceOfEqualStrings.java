import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by bacuty on 22.10.2015 ?..
 */
public class _03LargestSequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scannner=new Scanner(System.in);
        String[] words=scannner.nextLine().split(" ");
        HashMap<String,Integer> result=new HashMap<>();
        for(int i=0;i<words.length;i++){
            String word=words[i];
            result.putIfAbsent(word,0);
            result.put(word,result.get(word)+1);
        }
        int maxTimes= 0;//Collections.max(result.values());
        String word=null;
        for(Map.Entry<String,Integer> entry:result.entrySet()){
            if(entry.getValue()>maxTimes){
                maxTimes=entry.getValue();
                word=entry.getKey();
            }
        }
        for(int i=0;i<maxTimes;i++){
            System.out.print(word+" ");
        }
    }
}
