
class Solution {
    public int levels(TreeNode root){
        if(root == null) return 0;
        return 1 + Math.max(levels(root.left) , levels(root.right));
    }
    public void dfs(TreeNode root, List<Integer>ans ,int level){
        if(root == null) return;
        ans.set(level , root.val);
        dfs(root.left , ans , level + 1);
        dfs(root.right , ans , level + 1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        int n = levels(root);
        List<Integer>ans = new ArrayList<>();
        for(int i = 0; i<n; i++){
            ans.add(0);
        }
        dfs(root,ans,0);
        return ans;

    }
}