import java.util.Scanner;
public class Lucky {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        for(int i = 1; i <=n; i++){
        
            String numStr = input.next();

            int sum1 = numStr.charAt(0) + numStr.charAt(1) + numStr.charAt(2);
            int sum2 = numStr.charAt(3) + numStr.charAt(4) + numStr.charAt(5);

            if(sum1 == sum2){
                System.out.println("Yes");
            }else{
                System.out.println("NO");
            }

        }
        input.close();
        
    }
}
