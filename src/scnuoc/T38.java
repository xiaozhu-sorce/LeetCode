package scnuoc;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T38{

    public static long longString(String s){
        long len = 0;
        Map<Character,Integer> map = new HashMap<>();

        StringBuilder sb = new StringBuilder();
        for (char ch:s.toCharArray()){
            if(map.containsKey(ch)){
                sb.delete(0,sb.indexOf(String.valueOf(ch))+1);
            }else {
                map.put(ch, map.getOrDefault(ch,0) + 1);
            }
            sb.append(ch);
            len = Math.max(len,sb.length());
        }
        return len;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.print(longString(str));
    }
}