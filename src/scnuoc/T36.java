package scnuoc;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-10-23 20:11
 **/
public class T36 {
    static List<List<Integer>> lists;

    public static void backtrack(int k, int n, int start, LinkedList<Integer> l) {
        if (k == 0) {
            if (n == 0) lists.add(new LinkedList<>(l));
            return;
        }
        if (k < 0 || n < 0) return;

        for (int i = start; i < 10; i++) {
            l.add(i);
            backtrack(k - 1, n - i, i + 1, l);
            l.removeLast();
        }
    }

    public static List<List<Integer>> combinationSum3(int k, int n) {
        lists = new LinkedList<>();
        backtrack(k, n, 1, new LinkedList<>());
        return lists;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        combinationSum3(k, n);

        if (lists.isEmpty())
            System.out.print(0);

        for (int i = lists.size() - 1; i >= 0; i--) {
            List<Integer> list = lists.get(i);

            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j));
                if (j != list.size() - 1)
                    System.out.print(" ");
            }

            if (i != 0)
                System.out.println();
        }
    }
}
