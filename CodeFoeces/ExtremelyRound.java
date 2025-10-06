import java.util.Scanner;

public class ExtremelyRound {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        for(int i = 0; i < t; i++){
            int n = input.nextInt();
            System.out.println(countExtremelyRound(n));
        }
        input.close();
    }
    
    public static int countExtremelyRound(int n){
        int count = 0;
        for(int digit = 1; digit <= 9; digit++){
            long current = digit;

            while(current <= n){
                count++;
                current = current * 10;
            }
        }
        return count;
    }
}