import java.util.Scanner;
public class Bit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int x = 0;
        for(int i = 0; i < n; i++){
            String Opa = input.next();
            
            if(Opa.equals("++X") || Opa.equals("X++")){
                x += 1;
            }else if(Opa.equals("--X") || Opa.equals("X--")){
                x -= 1;
            }
        }
        System.out.println(x);
        input.close();
    }
}
