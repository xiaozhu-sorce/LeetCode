package HashTable;

import java.util.HashMap;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2023-02-01 10:43
 **/
public class T2325_DecodeTheMessage {
    public String decodeMessage(String key, String message) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        StringBuilder s = new StringBuilder("");
        char i = 'a';

        for (char ch : key.toCharArray()) {
            if (ch == ' '){
                continue;
            } else if (hashMap.containsKey(ch))
                continue;
            else {
                hashMap.put(ch,i++);
            }
        }

        for (char c : message.toCharArray()){
            s.append(hashMap.getOrDefault(c, ' '));
        }

        return s.toString();
    }
}
