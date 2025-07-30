import java.util.Scanner;
public class vanyaFence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int h = input.nextInt();
        int totalWidth = 0;
        for(int i = 0; i < n; i++){
            int hight = input.nextInt();

            if(hight <= h){
                totalWidth += 1;
            }else{
                totalWidth += 2;
            }
        }
        System.out.println(totalWidth);
        input.close();
    }
}