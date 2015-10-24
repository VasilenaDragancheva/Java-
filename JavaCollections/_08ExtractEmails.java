import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class _08ExtractEmails {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String text=scanner.nextLine();
        Pattern pattern= Pattern.compile("([a-z\\d][\\w\\-\\.]*[a-z\\d]@([a-z][a-z\\-]*[a-z]\\.)+[a-z]+)");
        Matcher matcher=pattern.matcher(text);

        while(matcher.find()){
            System.out.println(matcher.group());
        }
    }
}
