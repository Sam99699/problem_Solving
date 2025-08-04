import java.util.Scanner;

public class BuyAShovel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int r = input.nextInt();
        int n;
        
        for (n = 1; ; n++) {
            int total = n * k;
            if (total % 10 == 0 || total % 10 == r) {
                break;
            }
        }
        
        System.out.println(n);
        input.close();
    }
}