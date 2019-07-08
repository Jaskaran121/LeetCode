import java.util.*;


// Given the root of a binary tree, each node in the tree has a distinct value.

// After deleting all nodes with a value in to_delete, we are left with a forest (a disjoint union of trees).

// Return the roots of the trees in the remaining forest.  You may return the result in any order.
public class DeleteNodesAndReturnForest {

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
    	List<TreeNode> returnList = new ArrayList<>();
    	returnList.add(root);
    	
    	for(int i=0;i<to_delete.length;i++)
    	{
    		// Searching the nodes to be deleted, starting from the root of all nodes present in returnList i.e disjoint sets of tree.
    		for(int j=0;j<returnList.size();j++)
    		{
    			boolean isNodeFound  = searchNodeToBeDeleted(null,returnList.get(j),to_delete[i],returnList);
    			if(isNodeFound)
    			{
    				break;
    			}
    		}
    	}	
        return returnList;
    }
    
    private boolean searchNodeToBeDeleted(TreeNode parent,TreeNode root,int deleteNodeValue,List<TreeNode> returnList){
    	if(root == null)
    		return false;
    	
    	if(root.val == deleteNodeValue)
    	{
    		// Detaching the root node from its parent.
    		if(parent != null && parent.left == root)
    		{
    			parent.left = null;
    		} else if(parent != null)
    			parent.right = null;
    		
    		// If for the case returnList contains the element to be deleted, since it is already added to it,
    		// we have to delete it. 
    		if(returnList.contains(root))
    		{
    			returnList.remove(root);
    		}
    		
    		// Adding if present left and right child to the returnList
    		if(root.left!=null)
    			returnList.add(root.left);
    		if(root.right!=null)
    			returnList.add(root.right);
    		return true;
    	}
    	searchNodeToBeDeleted(root,root.left,deleteNodeValue,returnList);
    	searchNodeToBeDeleted(root,root.right,deleteNodeValue,returnList);
    	return false;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// For the test-case
		// Input: root = [1,2,null,4,3], to_delete = [2,3]
		// Output: [[1],[4]]
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(3);
		
		DeleteNodesAndReturnForest obj = new DeleteNodesAndReturnForest();
		int[] to_delete = new int[] {2,3};
		List<TreeNode> list = obj.delNodes(root,to_delete );
		for(TreeNode node: list)
		{
			System.out.println(node.val);
		}
	}

}
class TreeNode {
	 int val;
	 TreeNode left;
	TreeNode right;
	 TreeNode(int x) { val = x; }
	 }
