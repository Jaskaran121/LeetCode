import java.util.Scanner;

public class NumberOfDaysInAMonth1118 {
	private int[] daysInMonth = new int[] {31,28,31,30,31,30,31,31,30,31,30,31};
	
	public int numberOfDays(int year,int month)
	{
		if(month==2 && checkLeapYear(year))
			return daysInMonth[month-1] + 1;
		return daysInMonth[month-1];
	}
	public boolean checkLeapYear(int year)
	{
		if(year%100!=0 && year%4==0) return true;
		if(year%100==0 && year%400==0) return true;
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int year = scan.nextInt();
		int month = scan.nextInt();
		NumberOfDaysInAMonth1118 obj = new NumberOfDaysInAMonth1118();
		System.out.println(obj.numberOfDays(year,month));
	}

}
