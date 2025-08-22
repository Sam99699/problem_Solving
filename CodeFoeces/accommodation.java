import java.util.Scanner;
public class accommodation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            int tp = input.nextInt();
            int tc = input.nextInt();

            if(tc - tp >= 2){
                count++;
            }
        }
        System.out.println(count);

        input.close();
    }
}
