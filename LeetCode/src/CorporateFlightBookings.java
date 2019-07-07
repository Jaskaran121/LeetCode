import java.util.Scanner;

// There are n flights, and they are labeled from 1 to n.

// We have a list of flight bookings.  The i-th booking bookings[i] = [i, j, k] means that we booked k seats from flights labeled i to j inclusive.

// Return an array answer of length n, representing the number of seats booked on each flight in order of their label.
public class CorporateFlightBookings {

	public int[] corpFlightBookings(int[][] bookings, int n) {
		int[] tempArray = new int[n+1];
		for(int row=0; row<bookings.length;row++) 
		 { 
			tempArray[bookings[row][0] -1] += bookings[row][2];
           tempArray[bookings[row][1]] -= bookings[row][2];
		 }
       int[] returnArray = new int[n];
       int sum = 0;
       for(int i=0;i<n;i++)
       {
           sum += tempArray[i];
           returnArray[i] = sum;
       }
       return returnArray;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		CorporateFlightBookings obj = new CorporateFlightBookings();
		// Can be dynamic size taking fixed size according to the example: -
		// Input: bookings = [[1,2,10],[2,3,20],[2,5,25]], n = 5
		// Output: [10,55,45,25,25]
		int[][] array = new int[3][3];
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<array.length;i++)
			{
			 for(int j=0;j<3;j++)
				{
					array[i][j] = scan.nextInt();
				}
			}
		int[] returnArray = obj.corpFlightBookings(array, 5);
		for(int i=0;i<5;i++)
			{
			 System.out.println(returnArray[i]);
			}
	}

}
