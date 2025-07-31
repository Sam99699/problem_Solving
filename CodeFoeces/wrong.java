import java.util.Scanner;
public class wrong {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int k = input.nextInt();
        
        for(int i = 0; i < k; i++){
            if(num % 10 != 0){
                num -= 1;
            }else{
                  num /= 10;
            }
        }
        System.out.println(num);
        input.close();
    }
}
