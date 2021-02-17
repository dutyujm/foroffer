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

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode tmp = res;
        while (l1!=null && l2!=null) {
            if (l1.val>l2.val) {
                res.next = l2;
                l2 = l2.next;
            }else {
                res.next = l1;
                l1 = l1.next;
            }
            res = res.next;

        }
        if (l1!=null) {
            res.next = l1;
        }
        if (l2!=null) {
            res.next = l2;
        }
        return tmp.next;
    }


    public boolean isSubStructure(TreeNode A, TreeNode B) {
        // 但凡是空
        if (A==null||B==null) {
            return false;
        }
        // 看看在这个节点是不是
        if (isSubStructure(A,B)){
            return true;
        }else {
            return isSubStructure(A.left,B)|| isSubStructure(A.right,B);
        }
        // 看看在儿子节点是不是
    }

    public boolean f1(TreeNode A,TreeNode B) {
        if (B==null) {
            return true;
        }
        if (A==null) {
            return false;
        }
        if (A.val == B.val) {
            return f1(A.left,B.left) && f1(A.right,B.right);
        }
        return false;
    }

    public TreeNode mirrorTree(TreeNode root) {
        if (root.right==null && root.left==null) {
            return null;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
    public boolean isSymmetric(TreeNode root) {
        if (root==null) {
            return true;
        }
        return recur(root.left,root.right);
    }

    boolean recur(TreeNode L, TreeNode R) {
        if(L == null && R == null) {
            return true;
        }
        if(L == null || R == null || L.val != R.val) {
            return false;
        }
        return recur(L.left, R.right) && recur(L.right, R.left);
    }

    public int[] spiralOrder(int[][] matrix) {

        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return new int[0];
        }
        int rows = matrix.length;
        int columns = matrix[0].length;
        int[] order = new int[rows * columns];
        int index = 0;
        int left = 0;
        int right = columns - 1;
        int  top = 0;
        int bottom = rows - 1;
        while (left <= right && top <= bottom) {
            for (int column = left; column <= right; column++) {
                order[index++] = matrix[top][column];
            }
            for (int row = top + 1; row <= bottom; row++) {
                order[index++] = matrix[row][right];
            }
            if (left < right && top < bottom) {
                for (int column = right - 1; column > left; column--) {
                    order[index++] = matrix[bottom][column];
                }
                for (int row = bottom; row > top; row--) {
                    order[index++] = matrix[row][left];
                }
            }
            left++;
            right--;
            top++;
            bottom--;
        }
        return order;
    }



    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (int item : pushed) {
            stack.push(item);
            while (!stack.isEmpty() && popped[i] == stack.peek()) {
                stack.pop();
                i++;
            }
        }
        return !stack.isEmpty();
    }

    public int[] levelOrder1(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> tmp = new LinkedList<>();
        if (root!=null) {
            tmp.add(root);
            res.add(root.val);
        }

        while (!tmp.isEmpty()) {
            TreeNode tmpNode = tmp.poll();
            if(tmpNode.left!=null) {
                res.add(tmpNode.left.val);
                tmp.add(tmpNode.left);
            }
            if(tmpNode.right!=null) {
                res.add(tmpNode.right.val);
                tmp.add(tmpNode.right);
            }
        }
        int[] arr = new int[res.size()];
        for (int i = 0; i < res.size(); i++) {
            arr[i] = res.get(i);
        }
        return arr;
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>  res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if(root!=null){
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            List<Integer> tmp = new ArrayList<>();
            for (int i = queue.size(); i >0 ; i--) {
                TreeNode tmpNode = queue.poll();
                tmp.add(tmpNode.val);

                if(tmpNode.left!=null) {
                    queue.add(tmpNode.left);
                }
                if(tmpNode.right!=null) {
                    queue.add(tmpNode.right);
                }
            }
            res.add(tmp);

        }
        return res;
    }


    public static void main(String[] args) {
        List<Integer> a1 = new ArrayList<>();
    }
}
