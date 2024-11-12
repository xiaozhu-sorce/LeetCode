package scnuoc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-15 18:50
 **/
public class T18 {
    static List<List<String>> lists;
    static int[][] flag;

    public static int isPartition(String s, int i, int j) {
        if (flag[i][j] != 0)
            return flag[i][j];
        int f = s.charAt(i) == s.charAt(j) ? 1 : -1;
        if (i > j)
            return f;
        if (i == j)
            return 1;
        return f > 0 && isPartition(s, i + 1, j - 1) > 0 ? 1 : -1;
    }

    public static void dfs(String s, int start, LinkedList<String> res) {
        if (start == s.length()) {
            lists.add(new ArrayList<>(res));
            return;
        }
        for (int i = start; i < s.length(); i++) {
            if (isPartition(s, start, i) == 1) {
                res.add(s.substring(start, i + 1));
                dfs(s, i + 1, res);
                res.removeLast();
            }
        }
    }

    public static List<List<String>> partition(String s) {
        int len = s.length();
        flag = new int[len][len];
        lists = new ArrayList<>();
        LinkedList<String> res = new LinkedList<>();
        dfs(s, 0, res);
        return lists;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        flag = new int[str.length()][str.length()];

        partition(str);

        System.out.print("[");
        for (int i = 0; i < lists.size(); i++) {
            System.out.print("[");
            List<String> li = lists.get(i);
            for (int j = 0; j < li.size(); j++) {
                System.out.print(li.get(j));
                if (j < li.size() - 1)
                    System.out.print(", ");
            }

            System.out.print("]");
            if (i < lists.size() - 1)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}
