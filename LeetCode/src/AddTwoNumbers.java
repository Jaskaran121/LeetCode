import java.util.*;

public class AddTwoNumbers {
	class ListNode {
		      int val;
		      ListNode next;
		      ListNode(int x) { val = x; }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list1 = new LinkedList<Integer>(Arrays.asList(2,4,3));
		List<Integer> list2 = new LinkedList<Integer>(Arrays.asList(5,6,6));
		AddTwoNumbers obj = new AddTwoNumbers();
		LinkedList<Integer> result = obj.calculate(list1,list2);
		System.out.println(result);
	}

	private LinkedList<Integer> calculate(List<Integer> list1, List<Integer> list2) {
		LinkedList<Integer> resultList = new LinkedList<Integer>();
		
		return resultList;
	}
	
	private int[] calucalteOnesTens(int num)
	{
		int[] array = new int[2];
		array[0] = num %10;
		//array[1] = nu,
		return null;
	}

}
