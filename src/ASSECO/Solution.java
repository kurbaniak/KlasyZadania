package ASSECO;

public class Solution {
    int[] array = {-6, -91,1011,-100,84,-22,0,1,473};

    public int solution(int[] A){
        int temp =0;
        for (int i = 0; i < A.length; i++) {
            if (A[i]%2==0)
            temp = temp + A[i];
        }
        return temp;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] tab = {-6, -91,1011,-100,84,-22,0,1,473};
        System.out.println(solution.solution(tab));
    }
}
