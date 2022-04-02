package Contest.biweekly_contest_75;

public class T6035_NumberofWaystoSelectBuildings {

    //自己纯暴力了，时间复杂度超了过不去呜呜呜
    public char reverse(char f){
        if(f == '1')
            return '0';
        else
            return '1';
    }

    public long numberOfWays2(String s) {
        int i = 0;
        long num = 0;
        char flag = s.charAt(0);
        int a = 1;
        int[] len = new int[s.length()];
        len[0]++;
        while (a<s.length()){

            while(a<s.length() && s.charAt(a) == flag){
                len[i]++;

                a++;
            }
            flag = reverse(flag);
            i++;
        }

        for(int j = 0 ;j < i-2;j++){
            for(int k = j+1 ;k < i-1;k+=2)
                for(int m = k+1 ;m < i;m+=2)
                    num+=len[j]*len[k]*len[m];
        }
        return num;
    }

    //经大佬点播，勉强过了
    public long numberOfWays1(String s) {
        long ans = 0;
        int prez = 0,preo = 0;
        int o = 0,z=0;
        for(int i = 0;i < s.length();i++){
            if(s.charAt(i) == '0')
                o++;
            else
                z++;
        }
        for(int i =0 ;i < s.length();i++){
            if(s.charAt(i) == '0'){
                preo++;
                ans+=prez*(z-prez);
            }else{
                prez++;
                ans+=preo*(o-preo);
            }
        }
        return ans;
    }
}
