import java.util.Scanner;

public class _06CountSpecifiedWord {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine().toLowerCase();
        String searchedWord=scanner.nextLine().toLowerCase();
        StringBuilder currentWord=new StringBuilder();
        int wordCounter=0;
        for(int i=0;i<text.length();i++){
            if(Character.isAlphabetic(text.charAt(i))){
                currentWord.append(text.charAt(i));
            }else{
                if(searchedWord.equals(currentWord.toString())){
                    wordCounter++;
                }
                currentWord=new StringBuilder();
            }
        }
        System.out.print(wordCounter);
    }
}
