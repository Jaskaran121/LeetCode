import java.util.*;

// Given a valid (IPv4) IP address, return a defanged version of that IP address.
// A defanged IP address replaces every period "." with "[.]".
public class DefaningIpAddress {

public String defangIPaddr(String address) {
	String[] stringArray = address.split("\\.");
	String returnString = "";
	for(int i=0;i<stringArray.length;i++)
	{
		//System.out.println(stringArray[i]);
		if(i == stringArray.length-1)
			returnString = returnString + stringArray[i];
		else 
			returnString = returnString + stringArray[i] + "[.]";
		
	}
	//System.out.println(returnString);
    return returnString; 
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DefaningIpAddress obj = new DefaningIpAddress();
		// Input: address = "1.1.1.1"
		// Output: "1[.]1[.]1[.]1"
		String returnedString  = obj.defangIPaddr("1.1.1.1");
		System.out.println(returnedString);
	}

}
