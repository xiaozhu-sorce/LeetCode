package Contest.winter_contest;

import java.util.Scanner;

public class K {
    public static void main(String[] args){
        int n,ans;
        int max = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        for(int i = 1 ; i <= n ; i++)
            if((ans = scanner.nextInt()) > max)
                max = ans;
        System.out.println(max);
    }
}
