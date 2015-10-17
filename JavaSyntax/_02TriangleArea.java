import java.util.Scanner;

public class _02TriangleArea {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int xA=scanner.nextInt();
        int yA=scanner.nextInt();
        int xB=scanner.nextInt();
        int yB=scanner.nextInt();
        int xC=scanner.nextInt();
        int yC=scanner.nextInt();
        double area=(xA*(yB-yC)+xB*(yC-yA)+xC*(yA*yB))/2;
        area=Math.abs(area);
        System.out.println(area);
        //if it is zero this means these points do not form triangle
    }
}
