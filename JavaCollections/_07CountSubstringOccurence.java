import java.util.Scanner;


public class _07CountSubstringOccurence {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        String searchedSubstring=scanner.nextLine();
        int countOccurences=0;
        for (int i = 0; i < text.length()-searchedSubstring.length()+1; i++) {
            String substring=text.substring(i,i+searchedSubstring.length());
            if(substring.equals(searchedSubstring)){
                countOccurences++;
            }

        }
        System.out.print(countOccurences);

    }
}
