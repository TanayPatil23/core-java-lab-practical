/*
Program : To check program is palindrom or not
@author : Tanay Patil
@Date : 18 aug
*/

class PalindromNumber
{
	 static void PalindromNum(int n)
	 {
	
	int r,num2 =0;
	
	int temp = n;
	while(n>0)
	{
	    r = n%10;
	    num2 =(num2*10)+r;
	    n = n/10;
	     if(num2==temp)
            System.out.println("number" + temp + " is a palindrom");
         else
		    System.out.println("number"+ temp + " is not palindrom"); 
 
	}
	
	 } 
	 public static void main(String arg[])
	 {
	 int num = Integer.parseInt(arg[0]);
		   PalindromNum(num);
	 }
	 
}