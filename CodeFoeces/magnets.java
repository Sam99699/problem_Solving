import java.util.Scanner;

public class magnets {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int group = 1;
        
        input.nextLine();
        
        String prevMagnet = input.nextLine();
        
        for(int i = 1; i < n; i++) {
            String currentMagnet = input.nextLine();

            if(prevMagnet.charAt(1) == currentMagnet.charAt(0)) {
                group++;
            }
            prevMagnet = currentMagnet;
        }
        
        System.out.println(group);
        input.close();
    }
}