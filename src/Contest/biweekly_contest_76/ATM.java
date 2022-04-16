package Contest.biweekly_contest_76;

class ATM {
    long[] money;
    int[] nums = {20, 50, 100, 200, 500};

    public ATM() {
        money = new long[5];
    }

    public void deposit(int[] banknotesCount) {
        for (int i = 0; i < 5; i++) {
            money[i] += banknotesCount[i];
        }
    }

    public int[] withdraw(int amount) {
        int[] getMoney = new int[5];
        long[] temp = new long[5];
        for (int i = 0; i < 5; i++) {
            temp[i] = money[i];
        }

        for (int i = 4; i >= 0; i--) {
            getMoney[i] = (int) Math.min(temp[i],Math.max(0L,(long)amount/nums[i]));
            amount -= getMoney[i] * nums[i];
            if (amount == 0) {
                for (int j = 0; j < 5; j++) {
                    money[j] -= getMoney[j];
                }
                return getMoney;
            }
        }

        return new int[]{-1};
    }

    public int[] withdraw1(int amo) {
        int[] cost = new int[5];
        long[] temp = new long[5];
        for (int i = 0; i < 5; i++) {
            temp[i] = money[i];
        }
        if (amo >= 500)
        {
            int co = amo / 500;
            if (temp[4] > co)
            {
                amo %= 500;
                cost[4] += co;
                temp[4] -= co;
            }
            else
            {
                cost[4] += temp[4];
                amo -= 500 * temp[4];
                temp[4] = 0;
            }
        }
        if (amo >= 200)
        {
            int co = amo / 200;
            if (temp[3] > co)
            {
                amo %= 200;
                cost[3] += co;
                temp[3] -= co;
            }
            else
            {
                cost[3] += temp[3];
                amo -= 200 * temp[3];
                temp[3] = 0;
            }
        }

        if (amo >= 100)
        {
            int co = amo / 100;
            if (temp[2] > co)
            {
                amo %= 100;
                cost[2] += co;
                temp[2] -= co;
            }
            else
            {
                cost[2] += temp[2];
                amo -= 100 * temp[2];
                temp[2] = 0;
            }
        }
        if (amo >= 50)
        {
            int co = amo / 50;
            if (temp[1] > co)
            {
                amo %= 50;
                cost[1] += co;
                temp[1] -= co;
            }
            else
            {
                cost[1] += temp[1];
                amo -= 50 * temp[1];
                temp[1] = 0;
            }
        }
        if (amo >= 20)
        {
            int co = amo / 20;
            if (temp[0] > co)
            {
                amo %= 20;
                cost[0] += co;
                temp[0] -= co;
            }
            else
            {
                cost[0] += temp[0];
                amo -=  20 * temp[0];
                temp[0] = 0;
            }
        }
        if (amo > 0)
        {
            return new int[]{-1};
        }
        else{
            for (int j = 0; j < 5; j++) {
                money[j] -= cost[j];
            }
            return cost;
        }
    }
}
