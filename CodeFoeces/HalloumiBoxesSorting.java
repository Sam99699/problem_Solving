import java.util.Scanner;
public class HalloumiBoxesSorting {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int j = 0; j < t; j++){
            int n = input.nextInt();
            int k = input.nextInt();
            int [] array = new int[n];
            for(int i = 0; i < n; i++){
                array[i] = input.nextInt();
            }
            if(k >= 2){
                System.out.println("YES");
            }else{
                boolean sorted = true;
                for(int i = 0; i < n - 1; i ++){
                    if(array[i] > array[i+1]){
                        sorted = false;
                    }
                }
                if(sorted){
                    System.out.println("YES");
                }else{
                    System.out.println("NO");
                }
            }
        }
        input.close();
    }
}
