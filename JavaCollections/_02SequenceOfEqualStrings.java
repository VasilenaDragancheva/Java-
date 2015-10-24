import java.util.*;

public class _02SequenceOfEqualStrings {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] strings=scanner.nextLine().split(" ");
        Map<String,Integer> result=new HashMap<String,Integer>();
        for(String word:strings){
            result.putIfAbsent(word, 0);
            result.put(word,result.get(word)+1);
        }
       for(Map.Entry<String,Integer> entry :result.entrySet()){
           int times=entry.getValue();
           String word=entry.getKey();
           for(int i=0;i<times;i++){
               System.out.print(word+" ");
           }
             System.out.println();
       }
    }
}
