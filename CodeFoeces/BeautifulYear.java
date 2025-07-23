import java.util.Scanner;

public class BeautifulYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y = input.nextInt();
        
        while (true) {
            y++;
            String yearSt = Integer.toString(y);
            
            if (yearSt.charAt(0) != yearSt.charAt(1) &&
                yearSt.charAt(0) != yearSt.charAt(2) &&
                yearSt.charAt(0) != yearSt.charAt(3) &&
                yearSt.charAt(1) != yearSt.charAt(2) &&
                yearSt.charAt(1) != yearSt.charAt(3) &&
                yearSt.charAt(2) != yearSt.charAt(3)) {
                
                System.out.println(y);
                break;
            }
        }
        input.close();
    }
}