package Contest.LeetCode_spring_contest;

public class C0002 {
    boolean[] used;
    int de;
    public int perfectMenu(int[] materials, int[][] cookbooks, int[][] attribute, int limit) {
        used = new boolean[cookbooks.length];
        int del = 0;
        traverse(materials,cookbooks,attribute,used,limit,del);
        return de;
    }

    public void traverse(int[] materials, int[][] cookbooks, int[][] attribute, boolean[] used,int limit,int del) {
        for (int i = 0; i < 5;i++){
            if (materials[i] < 0){
                return ;
            }
        }

        de = Math.max(del,de);

        for (int i = 0;i < cookbooks.length;i++){
            if(used[i])
                continue;
            for (int j = 0; j < 5;j++){
                materials[j] -= cookbooks[i][j];
            }

            limit -= attribute[i][1];
            del += attribute[i][0];
            used[i] = true;


            traverse(materials, cookbooks, attribute, used, limit, del);

            for (int j = 0; j < 5;j++){
                materials[j] += cookbooks[i][j];
            }

            limit += attribute[i][1];
            del -= attribute[i][0];
            used[i] = false;
        }
    }

}
