import java.util.Scanner;
public class Anton_Letter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String LStr = input.nextLine();

        if(LStr.equals("{}")){
            System.out.println(0);
            return;
        }
        boolean[] letters = new boolean[26];
        int count = 0;

        for(int i = 0; i < LStr.length(); i++){
            char Ch = LStr.charAt(i);

            if(Ch >= 'a' && Ch <= 'z'){
                int index = Ch - 'a';

                if(!letters[index]){
                    letters[index] = true;
                    count++;
                }
            }
        }
        System.out.println(count);
        input.close();
    }
}
