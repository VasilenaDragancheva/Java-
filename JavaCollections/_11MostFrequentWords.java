import java.util.*;

/**
 * Created by bacuty on 23.10.2015 ?..
 */
public class _11MostFrequentWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine().toLowerCase();
        StringBuilder word=new StringBuilder();
        Map<String,Integer> words= new HashMap<>();
        for(int i =0;i<text.length();i++){
            char currChar=text.charAt(i);
            if(Character.isAlphabetic(currChar)){
                word.append(currChar);
            }else{
                String currentWord =word.toString();
                if(!currentWord.isEmpty()) {
                    words.putIfAbsent(currentWord, 0);
                    words.put(currentWord, words.get(currentWord) + 1);
                }
                word=new StringBuilder();
            }

        }
        int maxValue=0;
        TreeSet<String> mostFrequentWords=new TreeSet<>();
        maxValue=Collections.max(words.values());

        for(String key:words.keySet()){
            if(words.get(key)==maxValue){
                mostFrequentWords.add(key);
            }
        }
       for(String str:mostFrequentWords){
           System.out.println(str+" -> "+ maxValue);
       }
    }
}
