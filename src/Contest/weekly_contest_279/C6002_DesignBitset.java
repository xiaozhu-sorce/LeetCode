package Contest.weekly_contest_279;

public class C6002_DesignBitset {
    //6002. Design Bitset，超时，未通过。
    long[] a;
    int s;
    public C6002_DesignBitset(int size) {
        a = new long[size];
        s = size;
    }

    public void fix(int idx) {
        a[idx] = 1;
    }

    public void unfix(int idx) {
        a[idx] = 0;
    }

    public void flip() {
        for(int i = 0;i < s;i++){
            a[i] = a[i] == 0? 1:0;
        }
    }

    public boolean all() {
        for(int i = 0;i < s;i++){
            if(a[i] == 0)
                return false;
        }
        return true;
    }

    public boolean one() {
        for(int i = 0;i < s;i++){
            if(a[i] == 1)
                return true;
        }
        return false;
    }

    public int count() {
        int num = 0;
        for(int i = 0;i < s;i++){
            if(a[i] == 1)
                num++;
        }
        return num;
    }

    public String toString() {
        return String.valueOf(a);
    }
}
