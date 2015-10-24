import java.util.Scanner;

public class _05CountAllWords {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        int words=0;
        for(int i=0;i<text.length();i++){
            boolean currentNotAlphabet= !Character.isAlphabetic(text.charAt(i));
            boolean previosAlphabet=i-1>=0&& Character.isAlphabetic(text.charAt(i-1));
            if(currentNotAlphabet&&previosAlphabet){
                words++;
            }
        }
        System.out.print(words);
    }
}
