public class T1769 {
    public int[] minOperations(String boxes) {
        
        int[] answer = new int[boxes.length()];

        for (int i = 0; i < answer.length; i++) {
            char[] box = boxes.toCharArray();
            for (int j = 0; j < answer.length; j++) {
                if (i != j) {
                    if (box[j] != '0') {
                        answer[i] += Math.abs(i - j);
                        box[j] -= 1;
                    } else {
                        continue;
                    }
                }
            }
        }
        
        return answer;
    }
}