/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<List<Integer>> res = new ArrayList<>();

        if(root == null){
            return res;
        }
        
        queue.offer(root);

        while(!queue.isEmpty()){
            int levelSize = queue.size();
            ArrayList<Integer> levelRes = new ArrayList<>();

            for(int i = 0; i < levelSize; i++){
                TreeNode curr = queue.poll();
                levelRes.add(curr.val);

                if(curr.left != null){
                    queue.offer(curr.left);
                }
                if(curr.right != null){
                    queue.offer(curr.right);
                }
            }

            res.add(levelRes);
        }

        return res;
        
    }
}
