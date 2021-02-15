package cn.dutyujm.test;
import cn.dutyujm.leetcode.foroffer.no06.ListNode;
import cn.dutyujm.leetcode.foroffer.no07.TreeNode;

import java.lang.*;
import java.util.*;
public class sda {
    public int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }else {
                set.add(num);
            }

        }
        return 0;
    }

    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int row = 0;
        int column = columns-1;
        while (column>=0 && row<rows) {
            if (matrix[row][column] > target) {
                column--;
            }else  if (matrix[row][column] < target){
                row++;
            }else {
                return true;
            }
        }
        return false;
    }

    public String replaceSpace(String s) {
        char[] chars = s.toCharArray();
        StringBuffer stringBuffer = new StringBuffer("");
        for (char aChar : chars) {
            if (aChar==' ') {
                stringBuffer.append("%20");
            }else {
                stringBuffer.append(aChar);
            }
        }
        return stringBuffer.toString();
    }
    public int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        while (head!=null) {
            stack.push(head.val);
            head = head.next;
        }
        int[] arr= new int[stack.size()];
        int i = 0 ;
        while (!stack.isEmpty()) {
            arr[i++] = stack.pop();
        }
        return arr;
    }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length==0 || preorder.length!=inorder.length) {
            return null;
        }
        int val = preorder[0];
        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (val== inorder[i]) {
                index = i;
                break;
            }
        }
        TreeNode res = new TreeNode(preorder[0]);
        int length = preorder.length;
        res.left = buildTree(Arrays.copyOfRange(preorder,1,index+1),Arrays.copyOfRange(inorder,0,index));
        res.right = buildTree(Arrays.copyOfRange(preorder,index+1,length),Arrays.copyOfRange(inorder,index+1,length));
        return res;
    }
    Stack<Integer> stack1;
    Stack<Integer> stack2;


    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        if (stack2.isEmpty()) {
            return -1;
        }else {
            return stack2.pop();
        }
    }

    public int minArray(int[] numbers) {
        if (numbers.length==0) {
            return 0;
        }
        int left = 0;
        int right = numbers.length-1;
        while (left<right) {
            int mid = left+right >>1;
            if (numbers[mid] > numbers[right]) {
                left = mid+1;
            }else if(numbers[mid] < numbers[right]) {
                right = mid;
            }else {
                right--;
            }
        }
        return numbers[left];
     }



    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < board.length; i++) {
            for (int i1 = 0; i1 < board[0].length; i1++) {
                if (dfs(board,chars,i,i1,0)) {
                    return true;
                }
            }
        }
        return false;
    }
    boolean dfs(char[][] board, char[] word, int i, int j, int k) {
        if (i>board.length|| j>board[0].length||i<0||j<0||board[i][j]!=word[k]) {
            return false;
        }
        if (k== word.length-1) {
            return true;
        }
        board[i][j] = ' ';
        boolean res = dfs(board,word,i+1,j,k+1) || dfs(board,word,i,j+1,k+1)|| dfs(board,word,i-1,j,k+1)|| dfs(board,word,i,j-1,k+1);
        board[i][j] = word[k];
        return res;
    }


    public int movingCount(int m, int n, int k) {
        if (k==0) {
            return 1;
        }
        boolean[][] tmp = new boolean[m][n];
        tmp[0][0] = true;
        int res = 0;
        for (int i = 0; i < m; i++) {
            for (int i1 = 0; i1 < n; i1++) {
                if (i==0&& i1==0) {
                    continue;
                }
                if (sum(i,i1)>k) {
                    continue;
                }
                if (i>=1) {
                    tmp[i][i1] |= tmp[i=1][i1];
                }
                if (i1>=1) {
                    tmp[i][i1] |= tmp[i][i1-1];
                }
                res+= tmp[i][i1]?1:0;
            }
        }
        return res;
    }
    public int sum(int x,int y){
        int res = 0;
        while (x!=0) {
            res+=x%10;
            x = x/10;
        }
        while (y!=0) {
            res+=y%10;
            y = y/10;
        }
        return res;
    }

    public int cuttingRope(int n) {
        if(n <= 3) {
            return n - 1;
        }
        int a = n / 3, b = n % 3;
        if(b == 0) {
            return (int)Math.pow(3, a);
        }
        if(b == 1) {
            return (int)Math.pow(3, a - 1) * 4;
        }
        return (int)Math.pow(3, a) * 2;
    }

    public int hammingWeight(int n) {
        int res = 0;
        while(n != 0) {
            res++;
            n &= n - 1;
        }
        return res;
    }

    public double myPow(double x, int n) {
        if (x == 0) {
            return 0;
        }
        long b = n;
        double res = 1.0;
        if (b<0) {
            x = 1/x;
            b = -b;
        }
        while(b > 0) {
            if((b & 1) == 1) {
                res *= x;
            }
            x *= x;
            b >>= 1;
        }
        return res;

    }
    public int[] printNumbers(int n) {
        int end = (int)Math.pow(10, n) - 1;
        int[] res = new int[end];
        for(int i = 0; i < end; i++) {
            res[i] = i + 1;
        }
        return res;

    }
    public ListNode deleteNode(ListNode head, int val) {
        ListNode tmp = head;
        if (head.val==val) {
            return head.next;
        }
        while (tmp!=null) {
            if (tmp.next.val==val) {
                tmp.next = tmp.next.next;
                break;
            }
            tmp = tmp.next;
        }
        return head;
    }
    
    public int[] exchange(int[] nums) {
        int right = nums.length-1;
        int left =0 ;
        while (right>left) {
            while (right>left&&nums[right]%2 == 0) {
                right--;
            }
            while (right>left&&nums[left]%2==1) {
                left++;
            }
            int tmp = nums[right];
            nums[right] = nums[left];
            nums[left] = tmp;
        }
        return nums;
    }
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode fast = head;
        ListNode slow = head;
        for (int i = 0; i < k; i++) {
            fast = fast.next;
        }
        while (fast!=null) {
            fast = fast.next;
            slow = slow.next;
        }
        return  slow;
    }
    public ListNode reverseList(ListNode head) {
        ListNode res = null;
        if (head==null) {
            return res;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast.next!=null) {
            slow.next = res;
            slow = fast;
            fast = fast.next;
        }
        slow.next = res;
        return slow;

    }
    public static void main(String[] args) {

    }
}
