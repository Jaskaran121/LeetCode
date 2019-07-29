import java.util.*;

public class LargestUniqueNumber1133 {
	public int largestUniqueNumber(int[] array) {
		Map<Integer,Integer> hmap = new HashMap<>();
		for(int i=0;i<array.length;i++)
		{
			if(hmap.containsKey(array[i]))
			{
				int count = hmap.get(array[i]);
				hmap.put(array[i], ++count);
			}
			else
				hmap.put(array[i], 1);
		}
		while(hmap.size()>0)
		{
			int max = hmap.keySet().stream().max((i1,i2) -> i1.compareTo(i2)).get();
			if(hmap.get(max)==1)
				return max;
			hmap.remove(max);
		}
		return -1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[] {5,7,3,9,4,9,8,3,1};
		LargestUniqueNumber1133 obj = new LargestUniqueNumber1133();
		System.out.println(obj.largestUniqueNumber(array));
	}

}
