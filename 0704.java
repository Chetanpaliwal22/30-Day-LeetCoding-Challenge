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
    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> listInt = new ArrayList<List<Integer>>();
        if(root == null){
            return listInt;
        }
        queue.add(root);
        List<Integer> list = new ArrayList<>();
            list.add(root.val);
            listInt.add(list);
        while(!queue.isEmpty()){
            int size = queue.size();
            list = new ArrayList<Integer>();
            for(int i=0 ;i<size;i++){
                TreeNode node = queue.poll();
                if(node.left != null){
                    list.add(node.left.val);
                    queue.add(node.left);
                }
                if(node.right !=null){
                    list.add(node.right.val);
                    queue.add(node.right);
                }
            }
            if(list.size()>0)
            listInt.add(list);
        }
        Collections.reverse(listInt);
  
        return listInt;
    }
}
