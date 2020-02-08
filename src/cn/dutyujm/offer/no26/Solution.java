package cn.dutyujm.offer.no26;

import java.util.List;
import java.util.ArrayList;


public class Solution {
    TreeNode pre=null;
    public TreeNode Convert(TreeNode pRootOfTree) {
        if(pRootOfTree==null) {
            return null;
        }
        Convert(pRootOfTree.right);
        if(pre==null) {
            pre=pRootOfTree;
        } else{
            pRootOfTree.right=pre;
            pre.left=pRootOfTree;
            pre=pRootOfTree;
        }
        Convert(pRootOfTree.left);
        return pre;
    }
}
