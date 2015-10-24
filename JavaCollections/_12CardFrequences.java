import java.util.*;

/**
 * Created by bacuty on 23.10.2015 ?..
 */
public class _12CardFrequences {
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        String[] input =scanner.nextLine().split(" ");
        int n=input.length;
        LinkedHashMap<String,Integer> cards=new LinkedHashMap<>();
        for(String card:input){
            String face=card.substring(0,card.length()-1);
            cards.putIfAbsent(face,0);
            cards.put(face,cards.get(face)+1);
        }
        for(Map.Entry<String,Integer> entry:cards.entrySet()){
            String face=entry.getKey();
            double percentage=entry.getValue()/(double)n;
            System.out.println(String.format("%s -> %.2f",face,percentage));

        }
    }
}
