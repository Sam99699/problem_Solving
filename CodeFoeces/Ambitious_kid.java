import java.util.Scanner;
public class Ambitious_kid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        int []array = new int[n];
        for(int i = 0; i < n; i++){
            array[i] = input.nextInt();
        }

        int mainOperations = Math.abs(array[0]);
        for(int i = 0; i < n; i++){
            int absValue = Math.abs(array[i]);
            if(absValue < mainOperations){
                mainOperations = absValue;
            }
        }
        System.out.println(mainOperations);
        input.close();
    }
}
