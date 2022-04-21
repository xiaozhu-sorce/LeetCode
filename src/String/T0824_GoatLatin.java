package String;

public class T0824_GoatLatin {
    public String toGoatLatin(String sentence) {
        char[] chars = new char[]{'a', 'e', 'i', 'o', 'u'};
        StringBuilder sb = new StringBuilder();
        int index = 0;
        boolean flag = false;
        StringBuilder numa = new StringBuilder();
        numa.append("a");

        for (String s : sentence.split(" ")) {
            flag = false;
            String temp = s;
            for (int i = 0; i < 5; i++) {
                if (temp.toLowerCase().charAt(0) == chars[i]) {
                    flag = true;
                    break;
                }
            }
            if (!flag) temp = s.substring(1) + s.charAt(0);
            else temp = s;
            sb.append(temp).append("ma").append(numa).append(" ");
            numa.append("a");
        }

        return sb.toString().trim();
    }
}
