package scnuoc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2024-11-01 11:37
 * 2 5 2
 * 3 0 5
 * 1 2 10
 * 3 2
 **/
public class T23 {
    static List<Integer> price = new ArrayList<>();
    static List<List<Integer>> special = new ArrayList<>();
    static List<Integer> needs = new ArrayList<>();
    static int n;

    //needs是根据要不要使用大礼包（选择列表）而动态变化的，也就是在回溯中谈到的决策路径
    public static int dfs(List<Integer> price, List<List<Integer>> specials, List<Integer> needs) {
        int ans = 0;
        for (int i = 0;i < n;i++){
            ans+=needs.get(i) * price.get(i);
        }

        for (List<Integer> special:specials) {
            //拷贝出一个curr，从而不改变needs的值
            List<Integer> curr = new ArrayList<>(needs);

            boolean flag = false;
            for (int j = 0; j < n; j++) {
                if (needs.get(j) - special.get(j) < 0) {
                    flag = true;
                    break;
                }
                curr.set(j, needs.get(j) - special.get(j));
            }

            // 未超出数量限制
            if (!flag) {
                // 选定这个礼包，并继续递归
                ans = Math.min(ans, special.get(n) + dfs(price, specials, curr));
            }
        }

        return ans;

    }

    public static int shoppingOffers(List<Integer> price, List<List<Integer>> specials, List<Integer> needs) {
        n = needs.size();
        return dfs(price,specials,needs);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.nextLine();
        String[] str = s.split(" ");
        for (int i = 0; i < str.length - 1; i++) {
            price.add(Integer.parseInt(str[i]));
        }
        int size = Integer.parseInt(str[str.length - 1]);
        for (int j = 0; j < size; j++) {
            String s1 = scanner.nextLine();
            String[] str1 = s1.split(" ");
            List<Integer> list = new LinkedList<>();
            for (int i = 0; i < str1.length; i++) {
                list.add(Integer.parseInt(str1[i]));
            }
            special.add(list);
        }
        String s2 = scanner.nextLine();
        String[] str2 = s2.split(" ");
        for (int i = 0; i < str2.length; i++) {
            needs.add(Integer.parseInt(str2[i]));
        }

        System.out.print(shoppingOffers(price, special, needs));
    }
}
