package Contest.biweekly_contest_76;

public class T6061_NumberofWaystoBuyPensandPencils {
    public long waysToBuyPensPencils(int total, int cost1, int cost2) {
        long num = 0;
        int to = total;
        for (int i = 0; i < total / cost1 + 1; i++,to = total) {
            to-= i * cost1;
            num += to/cost2;
        }
        return num;
    }
}
