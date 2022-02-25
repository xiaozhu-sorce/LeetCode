package String;

public class T0537_ComplexNumberMultiplication {
    public String complexNumberMultiply(String num1, String num2) {
        String[] ss1 = num1.split("\\+|i"), ss2 = num2.split("\\+|i");
        int a = Integer.parseInt(ss1[0]), b = Integer.parseInt(ss1[1]);
        int c = Integer.parseInt(ss2[0]), d = Integer.parseInt(ss2[1]);

        StringBuilder sb = new StringBuilder();
        sb.append(a*c-b*d);
        sb.append("+");
        sb.append(a*d+b*c);
        sb.append("i");
        return sb.toString();
    }
}
