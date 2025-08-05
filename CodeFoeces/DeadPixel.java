import java.util.Scanner;
public class DeadPixel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            int a = input.nextInt();
            int b = input.nextInt();
            int x = input.nextInt();
            int y = input.nextInt();

            int areaAbove = a * y;
            int areaBelow = a * (b - y - 1);
            int areaLeft = b * x;
            int areaRight = b * (a - x - 1);

            int maxArea = Math.max(Math.max(areaAbove, areaBelow), Math.max(areaLeft, areaRight));

            System.out.println(maxArea);
        }
        input.close();
    }
}
