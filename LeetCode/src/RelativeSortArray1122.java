import java.util.*;
import java.util.stream.Collectors;

// Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
// Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2.  
// Elements that don't appear in arr2 should be placed at the end of arr1 in ascending order.
public class RelativeSortArray1122 {
	Map<Integer,Integer> hashMap = new LinkedHashMap <>();
	public int[] relativeSortArray(int[] arr1, int[] arr2) {
		Arrays.sort(arr1);
		List<Integer> arr1List  = Arrays.stream( arr1 ).boxed().collect(Collectors.toList());
		for(int number : arr1)
		{
			if(!hashMap.containsKey(number))
			{
				hashMap.put(number, Collections.frequency(arr1List, number));
			}	
		}
		int[] relativeSortedArray = new int[arr1.length];
		int index = 0;
		int indexofSortedArray = 0;
		while(hashMap.size()>0)
		{
			int count = (index<arr2.length) ? hashMap.get(arr2[index]) : hashMap.entrySet().iterator().next().getValue();
			int key = (index<arr2.length) ? arr2[index] : hashMap.entrySet().iterator().next().getKey();
			
			while(count>0)
			{
				relativeSortedArray[indexofSortedArray] = key;
				indexofSortedArray++;
				count--;
			}
			hashMap.remove(key);
			index++;
		}
		
        return relativeSortedArray;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TestCase1:
		// Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
		// Output: [2,2,2,1,4,3,3,9,6,7,19]
		RelativeSortArray1122 obj = new RelativeSortArray1122();
		obj.relativeSortArray(new int[] {2,3,1,3,2,4,6,7,9,2,19}, new int[] {2,1,4,3,9,6});
		
	}

}
