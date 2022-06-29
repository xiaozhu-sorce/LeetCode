package Design;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * @program: T0009_PalindromeNumber.java
 * @description:
 * @author: XiaoZhu
 * @create: 2022-06-29 19:52
 **/
public class T0535_EncodeandDecodeTinyURL {
    Map<String, String> map = new HashMap<>();
    String str = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        String key = getString(8);
        while (map.containsKey(key)) {
            key = getString(8);
        }
        map.put(key, longUrl);
        return key;
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        int p = shortUrl.lastIndexOf('/') + 1;
        String key = shortUrl.substring(p);
        return map.get(key);
    }

    public String getString(int length) {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            int number = random.nextInt(62);
            stringBuilder.append(str.charAt(number));
        }
        return stringBuilder.toString();
    }
}
