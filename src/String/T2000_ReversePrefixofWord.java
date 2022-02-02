package String;

public class T2000_ReversePrefixofWord {
    public String reversePrefix(String word, char ch) {
        char[] w = word.toCharArray();
        char[] wd = new char[word.length()];
        int i,j;
        for(i = 0; i < w.length; i++){
            wd[i] = w[i];
            if(w[i]==ch){
                break;
            }
        }

        if(i==w.length)
            return word;

        for(j = 0; j < i+1; j++)
            w[j] = wd[i-j];

        word = new String(w);
        return word;
    }
}
