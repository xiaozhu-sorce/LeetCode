package Array;

public class T0260_SingleNumberIII
{
    public int[] singleNumber(int[] nums) {
        Map<Integer,Integer> site = new HashMap<Integer, Integer>();
        for(int num : nums){
            site.put(num,site.getOrDefault(num, 0) + 1);
        }
        int[] ans = new int[2];
        int index = 0;
        for(Map.Entry<Integer, Integer> entry : site.entrySet())
            if(entry.getValue() == 1)
                ans[index++] = entry.getKey();
        return ans;
    }
}
