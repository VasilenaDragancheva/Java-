import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by bacuty on 16.10.2015 ?..
 */
public class _14MagicExchangableWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word1=scanner.next();
        String word2=scanner.next();
        boolean exchangable=checkExchangability(word1,word2);
        System.out.print(exchangable);
    }

    private static boolean checkExchangability(String word1, String word2) {
        boolean exchanabgle=true;
        Map<Character,Character> dictionary=new HashMap<Character,Character>();
        for(int i=0;i<word1.length();i++){
            if(!dictionary.containsKey(word1.charAt(i))) {
                dictionary.put(word1.charAt(i), word2.charAt(i));
            }else{
                if(dictionary.get(word1.charAt(i))!=word2.charAt(i)){
                    exchanabgle=false;
                    break;
                }
            }
        }
        return exchanabgle;
    }
}
