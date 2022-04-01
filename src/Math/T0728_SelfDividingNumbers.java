package Math;

import java.util.ArrayList;
import java.util.List;

public class T0728_SelfDividingNumbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        out:for (int i = left; i <= right; i++) {
            int cur = i;
            while (cur != 0) {
                int t = cur % 10;
                if (t == 0 || i % t != 0) continue out;
                cur /= 10;
            }
            list.add(i);
        }
        return list;
    }
}
