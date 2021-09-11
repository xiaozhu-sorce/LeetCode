package Array;

public class T1894_FindTheStudentThatWillReplaceTheChalk {
    public int chalkReplacer(int[] chalk, int k) {
        long sum = 0;
        for(int i = 0;i < chalk.length;i++){
            sum += chalk[i];
        }
        k %= sum;
        for(int i = 0;i < chalk.length;i++){
            k -= chalk[i];
            if(k < 0){
                return i;
            }
        }
        return 0;
    }
}
