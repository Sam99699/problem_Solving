import java.util.Scanner;
public class TheatreSqare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int m = input.nextInt();
        int a = input.nextInt();

        long LengthFlagStone = (n + a - 1)/a;
        long WidthFlagStone = (m+a-1)/a;
        long TotalFlagStone = LengthFlagStone * WidthFlagStone;

        System.out.println(TotalFlagStone);
        input.close();
    }
}
