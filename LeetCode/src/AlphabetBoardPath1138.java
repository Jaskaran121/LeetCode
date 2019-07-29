import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AlphabetBoardPath1138 {
	public String alphabetBoardPath(String target) {
        Map<Integer,List<Character>> myMap = new HashMap<>();
		myMap.put(0,Arrays.asList(new Character[] {'a','b','c','d','e'}));
		myMap.put(1,Arrays.asList(new Character[] {'f','g','h','i','j'}));
		myMap.put(2,Arrays.asList(new Character[] {'k','l','m','n','o'}));
		myMap.put(3,Arrays.asList(new Character[] {'p','q','r','s','t'}));
		myMap.put(4,Arrays.asList(new Character[] {'u','v','w','x','y'}));
		myMap.put(5,Arrays.asList(new Character[] {'z'}));
		String ans ="";
		int startRow =0;
		int startCol = 0;
		
		for(int i=0;i<target.length();i++)
		{	
			int row = target.charAt(i);
			for(int rowIndex:myMap.keySet())
			{
				if(myMap.get(rowIndex).contains(target.charAt(i)))
				{
					int colIndex = myMap.get(rowIndex).indexOf(target.charAt(i));
                    
					if(rowIndex == 5)
					{
						ans = goHorizontal(startCol,colIndex,ans);
						startCol = colIndex;
						ans = goVertical(startRow,rowIndex,ans);
						startRow = rowIndex;
					}
					else {
						ans = goVertical(startRow,rowIndex,ans);
						startRow = rowIndex;
						ans = goHorizontal(startCol,colIndex,ans);
						startCol = colIndex;
					}
					ans+='!';
				}
			}
		}
		return ans;
    }
	public String goVertical(int startRow,int rowIndex,String ans)
	{
		if(startRow !=rowIndex)
		{
			int count = Math.abs(startRow - rowIndex);
			while(count>0)
			{
				ans += (startRow>rowIndex) ? 'U' :'D';
				count--;
			}
		}
		return ans;
	}
	public String goHorizontal(int startCol,int colIndex,String ans)
	{
		if(startCol!=colIndex)
		{
			int count = Math.abs(startCol - colIndex);
			while(count>0)
			{
				ans += (startCol>colIndex) ? 'L' :'R';
				count--;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlphabetBoardPath1138 obj = new AlphabetBoardPath1138();
		System.out.println(obj.alphabetBoardPath("zdz"));
	}

}
