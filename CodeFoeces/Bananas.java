import java.util.Scanner;
public class Bananas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int k = input.nextInt();
        int n = input.nextInt();
        int w = input.nextInt();
        int totalCost = 0;
        for(int i = 1; i <= w; i++){
            totalCost += i * k;
        }
        int borrow = Math.max(totalCost - n, 0);
        System.out.println(borrow);

        input.close();
    }
}
