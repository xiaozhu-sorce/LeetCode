import java.util.Scanner;

public class dashuchengfa {
    public static String XiangChen(String X, String Y, int len){//大数相乘算法
        String str = "";
        if (len <= 4) {
            return "" + (Integer.parseInt(X) * Integer.parseInt(Y));
        }

        if (X.length() != Y.length()) { // 长度不同，调用GeShiHua方法，补齐X、Y，使之长度相同
            X = GeShiHua(X, len);
            Y = GeShiHua(Y, len);
        }

        // 将X、Y分别对半分成两部分
        int len1 = len / 2;
        int len2 = len - len1;
        String A = X.substring(0, len1);
        String B = X.substring(len1);
        String C = Y.substring(0, len1);
        String D = Y.substring(len1);

        // 乘法法则，分块处理
        int lenM = Math.max(len1, len2);
        String AC = XiangChen(A, C, len1);
        String AD = XiangChen(A, D, lenM);
        String BC = XiangChen(B, C, lenM);
        String BD = XiangChen(B, D, len2);

        // 【1】 处理BD，得到原位及进位
        String[] sBD = dealString(BD, len2);
        // 【2】 处理AD + BC的和
        String ADBC = Add(AD, BC);
        // 【3】 加上BD的进位
        if (!"0".equals(sBD[1])) {
            ADBC = Add(ADBC, sBD[1]);
        }
        // 【4】 得到ADBC的进位
        String[] sADBC = dealString(ADBC, lenM);

        // 【5】 AC加上ADBC的进位
        AC = Add(AC, sADBC[1]);
        // 【6】 最终结果
        str = AC + sADBC[0] + sBD[0];
        return str;
    }

    public static String GeShiHua(String x,int len){//格式化，使两乘数位数相同
        while (len > x.length()) {
            x = "0" + x;
        }
        return x;

    }

    public static String Add(String ad, String bc){//相加
        String str = "";
        // 两字符串长度要相同
        int lenM = Math.max(ad.length(), bc.length());
        ad = GeShiHua(ad, lenM);
        bc = GeShiHua(bc, lenM);

        // 按位加，进位存储在flag中
        int flag = 0;
        // 按序从后往前按位求和
        for (int i = lenM - 1; i >= 0; i--) {
            int t = flag + Integer.parseInt(ad.substring(i, i + 1))
                    + Integer.parseInt(bc.substring(i, i + 1));
            // 结果超过9，则进位当前位，保留个位数
            if (t > 9) {
                flag = 1;
                t = t - 10;
            } else {
                flag = 0;
            }
            // 拼接结果字符串
            str = "" + t + str;
        }
        if (flag != 0) {
            str = "" + flag + str;
        }
        return str;
    }

    // 处理数字串，分离出进位,String数组第一个为原位数字，第二个为进位
    private static String[] dealString(String ac, int lenn) {
        String[] str = { ac, "0" };

        if (lenn < ac.length()) {
            int t = ac.length() - lenn;
            str[0] = ac.substring(t);
            str[1] = ac.substring(0, t);
        } else {
            // 保证结果length与lenn一致，少于则高位补0
            String result = str[0];
            for (int i = result.length(); i < lenn; i++) {
                result = "0" + result;
            }
            str[0] = result;
        }
        return str;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("请输入乘数A（不以0开头的正整数）：");
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        if(!A.matches("^[1-9]\\d*$")){
            System.out.println("数字不合法！");
        }
        System.out.println("请输入乘数B（不以0开头的正整数）：");
        String B = sc.next();
        if(!B.matches("^[1-9]\\d*$")){
            System.out.println("数字不合法！");
        }
        sc.close();
        System.out.println(A + " * " + B + " = "
                + XiangChen(A, B, Math.max(A.length(), B.length())));// Math.max(A.length(), B.length())比较读入的字符串的长短
    }

}