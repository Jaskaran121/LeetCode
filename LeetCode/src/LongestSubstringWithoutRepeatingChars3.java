import java.util.*;
public class LongestSubstringWithoutRepeatingChars3 {
	// Given a string, find the length of the longest substring without repeating characters.
    // For e.g Input: "abcabcbb"
    // Output: 3 
   //  Explanation: The answer is "abc", with the length of 3. 
	public int lengthOfLongestSubstring(String s) {
        int index1 =0,index2=0,max=0;
        int length = s.length();
        Set<Character> mySet = new HashSet<>();
        while(index1<length && index2<length)
        {
            if(!mySet.contains(s.charAt(index2)))
            {
                mySet.add(s.charAt(index2++));
                max = Math.max(max,(index2-index1));
            }
            else
            {
                mySet.remove(s.charAt(index1++));
            }
        }
        return max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubstringWithoutRepeatingChars3 obj = new LongestSubstringWithoutRepeatingChars3();
		System.out.println(obj.lengthOfLongestSubstring("abcabcbb"));
	}

}
