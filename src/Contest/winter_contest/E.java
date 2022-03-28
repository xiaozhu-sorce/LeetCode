package Contest.winter_contest;

import java.util.Scanner;

public class E {
    public static void main(String[] args){
        int k,n;
        Scanner scanner = new Scanner(System.in);
        k = scanner.nextInt();
        n = scanner.nextInt();

        for(int i = 0 ;i < n;i++){
            if(k >= 50) k+=5;
            else    k += k/10;
            k+=5;
        }

        System.out.println(k);
    }
}
