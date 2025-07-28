import java.util.Scanner;
public class LuckyTicket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String Ticket = input.next();

        boolean isLucky = true;
        for(int i = 0; i < n; i++){
            char digit = Ticket.charAt(i);
            if(digit != '4' && digit != '7'){
                isLucky = false;
                break;
            }
        }
        if(isLucky){
            int haf = n/2;
            int sum1 = 0;
            int sum2 = 0;
            for(int i = 0; i < haf; i++){
                sum1 += Ticket.charAt(i) - '0';
            }
            for(int i = haf; i < n; i++){
                sum2 += Ticket.charAt(i) - '0';
            }
            if(sum1 == sum2){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }else{
            System.out.println("NO");
        }
        input.close();
    }
}
