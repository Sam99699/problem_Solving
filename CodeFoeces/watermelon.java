import java.util.Scanner;
public class watermelon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int w = scanner.nextInt();
        if(w % 2 == 0 && w > 2){
            System.out.println("Yes");
        }else{
            System.out.println("NO");
        }
        scanner.close();
    }

}
