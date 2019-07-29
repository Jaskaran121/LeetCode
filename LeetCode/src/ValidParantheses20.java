import java.util.Stack;

public class ValidParantheses20 {

	public boolean isValid(String s) {
		Stack<Character> stack = new Stack<>();
		for(int i=0;i<s.length();i++)
		{
			Character currentChar = s.charAt(i);
			if(currentChar == '(' || currentChar == '[' || currentChar == '{')
				stack.push(currentChar);
			if(currentChar == ')')
			{
				if(stack.size()!=0) return false;
				if(stack.pop() != '(')
					return false;
			}
			if(currentChar == ']')
			{
				if(stack.size()!=0) return false;
				if(stack.pop() != '[')
					return false;
			}
			if(currentChar == '}')
			{
				if(stack.size()!=0) return false;
				if(stack.pop() != '{')
					return false;
			}
		}
        return (stack.size() ==0) ? true : false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParantheses20 obj = new ValidParantheses20();
		System.out.println(obj.isValid(")"));
	}

}
