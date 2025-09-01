
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer>ans = new ArrayList<>();
        Stack<TreeNode>st = new Stack<>();
        if(root != null) st.push(root);
        while(st.size() > 0){
            TreeNode top = st.pop();
            ans.add(top.val);
            if(top.right != null) st.add(top.right);
            if(top.left != null) st.add(top.left);
        }
        return ans;
    }
}