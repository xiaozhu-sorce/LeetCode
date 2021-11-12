package BinarySearch;

public class T0374_GuessNumberHigherorLower {
    //方法是用来判断所猜的数字与其的大小，方法所写只是为了不报错
    public int guess(int num){
        return 0;
    }
    public int guessNumber(int n) {
        int gue;
        int left = 1,right = n;
        while(left<=right){
            gue = left + (right-left)/2;
            if(guess(gue) < 0){
                right = gue-1;
            }else if(guess(gue) > 0){
                left = gue+1;
            }else{
                return gue;
            }
    }
    return 0;
}
}
