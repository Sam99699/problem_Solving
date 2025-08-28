import java.util.Scanner;
public class queueToTheSchool {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int t = input.nextInt();
        input.nextLine();
        String s = input.nextLine();
        char[] queue = s.toCharArray();

        for(int Second = 0; Second < t; Second ++){
            char[] nextQueue = queue.clone();

            for(int i = 0; i < n-1; i++){
                if(queue[i] == 'B' && queue[i + 1] == 'G'){
                    nextQueue[i] = 'G';
                    nextQueue[i + 1] = 'B';
                }
            }
            queue = nextQueue;
        }
        System.out.println(new String(queue));
        input.close();
    }
}
