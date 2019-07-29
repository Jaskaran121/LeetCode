
public class ClosestBinarySearchTreeValue250 {
	static int min;
	static class Node{
		int value;
		Node left;
		Node right;
		Node(int value)
		{
			this.value = value;
		}
	}
	public void traversalTree(Node root,double target) {
		if(root ==null)
			return;
		if(Math.abs(root.value-target)<Math.abs(min-target))
			min = root.value;
		traversalTree(root.left,target);
		traversalTree(root.right,target);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(9); 
	    root.left    = new Node(4); 
	    root.right   = new Node(17); 
	    root.left.left = new Node(3); 
	    root.left.right = new Node(6); 
	    root.left.right.left = new Node(5); 
	    root.left.right.right = new Node(7); 
	    root.right.right = new Node(22); 
	    root.right.right.left = new Node(20); 
	    int k = 4;
	    min = root.value;
	    ClosestBinarySearchTreeValue250 obj = new ClosestBinarySearchTreeValue250();
	    obj.traversalTree(root, k);
	    System.out.println(min);
	}

}
