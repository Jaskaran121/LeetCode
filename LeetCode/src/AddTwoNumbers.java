//import java.util.*;
//
//public class AddTwoNumbers {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		List<Integer> list1 = new LinkedList<Integer>(Arrays.asList(2,4,3));
//		List<Integer> list2 = new LinkedList<Integer>(Arrays.asList(5,6,6));
//		AddTwoNumbers obj = new AddTwoNumbers();
//		LinkedList<Integer> result = obj.calculate(list1,list2);
//		System.out.println(result);
//	}
//
//	//private LinkedList<Integer> calculate(List<Integer> list1, List<Integer> list2) {
////		LinkedList<Integer> resultList = new LinkedList<Integer>();
////		int list1Size = list1.size();
////		int list2Size = list2.size();
////		List<Integer> listWithSmallSize = list1Size > list2Size ? list2 : list1;
////		List<Integer> listWithBigSize = list1Size > list2Size ? list1: list2; 
////		int carry = 0;
////		for(int i=0;i<listWithBigSize.size();i++)
////		{
////			if(i<listWithSmallSize.size())
////			{
////				int sum = listWithSmallSize.get(i) + listWithBigSize.get(i);
////				// Here checking also carry + sum%10 becomes greater then 9.
////				//int nextValue = carry ==0 ? sum%10 : (carry + sum%10)<10 ? carry + sum%10 : ;
////				carry = (sum/10)%10;
////				System.out.println(carry);
////				resultList.addFirst(nextValue);
////			}
////			else {
////				
////			}
////		}
////		return resultList;
//	}
//	
//	private int[] calucalteOnesTens(int num)
//	{
//		int[] array = new int[2];
//		array[0] = num %10;
//		//array[1] = nu,
//		return null;
//	}
//
//}
