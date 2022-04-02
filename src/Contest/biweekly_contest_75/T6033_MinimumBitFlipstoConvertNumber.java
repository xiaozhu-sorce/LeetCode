package Contest.biweekly_contest_75;

public class T6033_MinimumBitFlipstoConvertNumber {
    public int minBitFlips(int start, int goal) {
        int x = start^goal;
        return Integer.bitCount(x);
    }
}
