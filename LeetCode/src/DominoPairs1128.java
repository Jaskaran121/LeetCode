import java.util.*;

// Given a list of dominoes, dominoes[i] = [a, b] is equivalent to dominoes[j] = [c, d] if and only if 
// either (a==c and b==d), or (a==d and b==c) - that is, one domino can be rotated to be equal to another domino.
// Return the number of pairs (i, j) for which 0 <= i < j < dominoes.length, and dominoes[i] is equivalent to dominoes[j].
public class DominoPairs1128 {	

	public int numEquivDominoPairs(int[][] dominoes) {
	Map<String,Integer> hmap = new HashMap<>();
	for(int i=0;i<dominoes.length;i++)
	{
		String checkNumber = dominoes[i][0]<dominoes[i][1] ? dominoes[i][0] + "" + dominoes[i][1] : dominoes[i][1] + "" + dominoes[i][0];
		if(hmap.containsKey(checkNumber))
		{
			int count = hmap.get(checkNumber);
			hmap.put(checkNumber, ++count);
		}
		else
			hmap.put(checkNumber, 1);
	}
	int equivalentPairs = 0;
	for(String i : hmap.keySet())
	{
		if(hmap.get(i)>1)
		{
			equivalentPairs = equivalentPairs + ((hmap.get(i))*(hmap.get(i)-1))/2;
		}
	}
	  return equivalentPairs;  
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TestCase:-
		// Input: dominoes = [[1,2],[2,1],[3,4],[5,6]]
		// Output: 1
		DominoPairs1128 obj = new DominoPairs1128();
		System.out.println(obj.numEquivDominoPairs(new int[][] {{2,1},{5,4},{3,7},{6,2},{4,4},{1,8},{9,6},{5,3},{7,4},{1,9},{1,1},{6,6},{9,6},
			{1,3},{9,7},{4,7},{5,1},{6,5},{1,6},{6,1},{1,8},{7,2},{2,4},{1,6},{3,1},{3,9},{3,7},{9,1},{1,9},{8,9}}));
	}
}
