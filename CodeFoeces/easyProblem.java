import java.util.Scanner;

public class easyProblem {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean isHard = false;
        for(int i = 0; i < n; i++){
            int response = input.nextInt();
            if(response == 1){
                isHard = true;
            }
        }
        if(isHard){
            System.out.println("HARD");
        }else{
            System.out.println("EASY");
        }

        input.close();
    }
}