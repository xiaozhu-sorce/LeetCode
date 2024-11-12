package scnuoc;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class T16 {
    static List<List<Integer>> result = new LinkedList<>();

    public static void combine(int n, int k) {
        LinkedList<Integer> list = new LinkedList<>();
        backtrack(n, k,1, list);
    }

    public static void backtrack(int n, int k,int start, LinkedList trace) {
        if (trace.size() == k) {
            result.add(new LinkedList<>(trace));
            return;
        }

        for (int i = start; i <= n; i++) {
            trace.add(i);
            backtrack(n, k, i+1,trace);
            trace.removeLast();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        combine(n, k);

        System.out.print("[");
        for (int i = 0; i < result.size(); i++) {
            List<Integer> list = result.get(i);
            System.out.print("[");
            for (int j = 0; j < list.size(); j++) {
                System.out.print(list.get(j));
                if (j != list.size() - 1)
                    System.out.print(", ");
            }
            System.out.print("]");
            if (i != result.size() - 1)
                System.out.print(", ");
        }
        System.out.print("]");
    }
}
