import java.util.Scanner;
public class LineTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        for(int j = 0; j < t; j++){
            int n = input.nextInt();
            int x = input.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++){
                arr[i] = input.nextInt();
            }
            int maxGap = arr[0];
            for(int i = 1; i < n; i++){
                int gap = arr[i] - arr[i - 1];
                if(gap > maxGap){
                    maxGap = gap;
                }
                int lastGap = 2*(x - arr[n-1]);
                if(lastGap > maxGap){
                    maxGap = lastGap;
                }
                
            }
            System.out.println(maxGap);
        }
        input.close();
    }
}
