import java.util.Scanner;
import java.util.TreeSet;

/**
 * Created by bacuty on 23.10.2015 ?..
 */
public class _10ExtractAllUniqueWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine().toLowerCase();
       TreeSet<String> words=new TreeSet<>();
        StringBuilder word=new StringBuilder();
        for(int i =0;i<text.length();i++){
            char currChar=text.charAt(i);
            if(Character.isAlphabetic(currChar)){
                word.append(currChar);
            }else{
                String currentWord =word.toString();
                words.add(currentWord);
                word=new StringBuilder();
            }
        }
        for(String w:words){
            System.out.print(w+" ");
        }
    }
}
