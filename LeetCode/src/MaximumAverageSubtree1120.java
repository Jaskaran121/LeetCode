import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

public class MaximumAverageSubtree1120 {
	static List<Double> maxList = new ArrayList<>();
	public double maximumAverageSubtree(Node root) {
		treeTraversal(root);
		double max = maxList
			      .stream()
			      .mapToDouble(item->item)
			      .max().orElseThrow(NoSuchElementException::new);
        return max;
    }
	public void treeTraversal(Node root)
	{
		if(root == null)
			return;
		double[] sumCount = new double[] {0,0};
		calculateAverage(root,sumCount);
		maxList.add((sumCount[0]/sumCount[1]));
		treeTraversal(root.left);
		treeTraversal(root.right);
	}
	public void calculateAverage(Node node,double[] sumCount)
	{
		if(node == null)
			return;
		sumCount[0] = sumCount[0] + node.value;
		sumCount[1]++;
		calculateAverage(node.left,sumCount);
		calculateAverage(node.right,sumCount);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node root = new Node(5);
		root.left = new Node(6);
		root.right = new Node(1);
		MaximumAverageSubtree1120 obj = new MaximumAverageSubtree1120();
		System.out.println(obj.maximumAverageSubtree(root));
	}
}

class Node {
	int value;
	Node left;
	Node right;
	Node(int value)
	{
		this.value = value;
	}
}