import java.util.Scanner;
public class ArrayColoring {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();

        while(t-- > 0){
            int n = input.nextInt();
            int sum = 0;
            int oddCount = 0;
            for(int i = 0; i < n; i++){
                int num = input.nextInt();
                sum += num;
                if (num % 2 == 1){
                    oddCount++;
                }
            }
            if(sum % 2 == 1){
                System.out.println("NO");
            }else if (oddCount == n & n % 2 == 1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
        input.close();
    }
}
