import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Created by bacuty on 23.10.2015 ?..
 */
public class _13FilterArray {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String[] input=scanner.nextLine().split(" ");
        List<String> result=Arrays.stream(input).filter(w -> w.length() > 3).collect(Collectors.toList());
        System.out.println(result);
    }
}
