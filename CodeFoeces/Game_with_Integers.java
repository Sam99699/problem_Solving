import java.util.Scanner;
public class Game_with_Integers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int i = 0; i < t; i++){
            int n = input.nextInt();
            if(n % 3 == 0){
                System.out.println("Second");
            }else{
                System.out.println("First");
            }
        }
        input.close();
    }
}
