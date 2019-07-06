import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

//	Given an array of integers,return indices of the two numbers such that
//	they add up to a specific target.
//	Assume that each input would have exactly one solution,not using the same 
//	element twice.
public class TwoSum {
	//static int[] nums = new int[] {2,7,11,15};
	int value;
	int index;
	TwoSum()
	{
		
	}
	public int[] twoSum(int[] nums,int target)
	{
		Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
		for(int i=0;i<nums.length;i++)
		{
		int secondNum = target - nums[i];
		if(map.containsKey(secondNum) && map.get(secondNum) != i)
		{
			//System.out.println(i +" "+ map.get(secondNum));
			return new int[] {i,map.get(secondNum)};
		}
		}
		return null;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int[] nums = new int[] {3,2,4};
	    TwoSum obj = new TwoSum();
	    obj.twoSum(nums,9);
	}

}
