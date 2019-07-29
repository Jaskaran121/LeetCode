// Given a 32-bit signed integer, reverse digits of an integer.
// Input: -123
// Output: -321
public class ReverseInteger7 {
	public int reverse(long x) {
		String ans = x < 0 ? new StringBuilder(String.valueOf(-x)).append("-").reverse().toString()
                : new StringBuilder(String.valueOf(x)).reverse().toString();
        try {
            return Integer.parseInt(ans);
        } catch (Exception e) {
            return 0;
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReverseInteger7 obj = new ReverseInteger7();
		System.out.println(obj.reverse(123));
	}

}
