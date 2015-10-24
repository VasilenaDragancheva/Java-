import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by bacuty on 23.10.2015 ?..
 */
public class _09CombineListOfLetters {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
       String firstLine=scanner.nextLine();
       String secondLine=scanner.nextLine();
        List<Character> firstinput=new ArrayList<>();
        for(Character symbol :firstLine.toCharArray()){
            if(!Character.isWhitespace(symbol)){
                firstinput.add(symbol);
            }
        }
        for (int i= 0; i<secondLine.length(); i++) {
            char currChar=secondLine.charAt(i);
            if(!Character.isWhitespace(currChar)&&!firstinput.contains(currChar)){
                firstinput.add(currChar);
            }
        }
        System.out.print(firstinput);






    }
}
