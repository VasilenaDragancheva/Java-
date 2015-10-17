import java.util.Scanner;

/**
 * Created by bacuty on 16.10.2015 ?..
 */
public class _12CharacterMultiplier{
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String word1=scanner.next();
        String word2=scanner.next();

        int result=multiplyChars(word1,word2);
        System.out.print(result);
    }

    private static int multiplyChars(String word1, String word2) {
        int result=0;
        String longerSring=word1.length()>=word2.length()? word1:word2;
        String shorterString= longerSring.equals(word1)? word2:word1;
        for(int i=0;i<longerSring.length();i++){
            if(i<shorterString.length()){
                result+=longerSring.charAt(i)*shorterString.charAt(i);
            }else{
                result+=longerSring.charAt(i);
            }

        }


        return  result;

    }
}
