import java.util.Scanner;
public class NearlyLuckyNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String n = input.next();
        int count = 0;
        for(int i = 0; i < n.length(); i++){
            char digit = n.charAt(i);
            if(digit == '4' || digit == '7'){
                count++;
            }
        }
        if(count == 4 || count == 7){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        input.close();

    }
}  
