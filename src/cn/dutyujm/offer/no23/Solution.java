package cn.dutyujm.offer.no23;

/**
 * @Author YuJunMing
 * @Date 2020/1/30 14:40
 * DESCRIPTION:输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历的结果。如果是则输出Yes,否则输出No。假设输入的数组的任意两个数字都互不相同。
 */
public class Solution {
    public boolean VerifySquenceOfBST(int [] sequence) {
        if (sequence == null || sequence.length == 0) {
            return false;
        }
        return helpVerify(sequence,0,sequence.length-1);
    }
    public boolean helpVerify(int [] sequence, int start, int root) {
        if (start >= root) {
            return true;
        }

        int key = sequence[root];
        int i = 0 ;

        for(i=start; i < root; i++) {
            if(sequence[i] > key) {
                break;
            }
        }

        for(int j = i; j < root; j++) {
            if(sequence[j] < key) {
                return false;
            }
        }

        return helpVerify(sequence, start, i-1) && helpVerify(sequence, i, root-1);

    }

    public static void main(String[] args) {
        int [] a = {1,2,3,4,5,6};

        Solution solution = new Solution();
        System.out.println(solution.VerifySquenceOfBST(a));
    }
}
