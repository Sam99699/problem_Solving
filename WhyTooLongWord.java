import java.util.Scanner;
public class WhyTooLongWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.nextLine();
        for(int i = 0; i < n; i++){
            String word = input.nextLine();
            if(word.length() > 10){
                String abbreviation = word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1);
                System.out.println(abbreviation);
            }else{
                System.out.println(word);
            }
        }
        input.close();
    }
}