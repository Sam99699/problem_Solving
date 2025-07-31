import java.util.Scanner;
public class oddDivisor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            long x = input.nextLong();
            if((x & (x-1)) == 0){
                System.out.println("NO");
            }else{
                System.out.println("YES");
            }
        }
        input.close();
    }
}
