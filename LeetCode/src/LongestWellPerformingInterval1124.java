
// We are given hours, a list of the number of hours worked per day for a given employee.

// A day is considered to be a tiring day if and only if the number of hours worked is (strictly) greater than 8.

// A well-performing interval is an interval of days for which the number of tiring days is strictly 
// larger than the number of non-tiring days.

// Return the length of the longest well-performing interval.
public class LongestWellPerformingInterval1124 {

	public int longestWPI(int[] hours) {
		int length = hours.length;
		int [] tiringHours = new int[length];
		for(int i=0;i<length;i++)
		{
			tiringHours[i] = hours[i]>8 ? 1 : -1;
		}
		int maxInterval = 0;
		for(int outerIndex=0;outerIndex<length;outerIndex++)
		{
			int sum = 0;
			int count =0;
			for(int innerIndex=outerIndex;innerIndex<length;innerIndex++)
			{
				sum = sum + tiringHours[innerIndex];
				count++;
				if(sum>0 && maxInterval<count)
					maxInterval = count;
			}
		}
		
        return maxInterval;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Input: hours = [9,9,6,0,6,6,9]
		// Output: 3
		// Explanation: The longest well-performing interval is [9,9,6].
		LongestWellPerformingInterval1124 obj = new LongestWellPerformingInterval1124();
		obj.longestWPI(new int[] {9,9,6,0,6,6,9});
	}

}
