/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HP
 */
class MyBigNumber {
    public String sum(String s1 , String s2)
	{
		int balance = 0; // = 1 if plus 2 number > 9 else 0
                char value1 , value2; //use to keep single number
		int maxLenght = s1.length() > s2.length() ? s1.length() : s2.length(); // if lenght's string 1 > lenght's string 2 then maxstring = lenght's string1 else  lenght's string2
		String result = "";// use to keep result of this function;
		
		for(int i = 0 ; i < maxLenght ; i++) //carry out add 2 number
		{
                        if(s1.length() - i-1 < 0)
                        {
                            value1 = '0';
                        }else
                        {
                            value1 = s1.charAt(s1.length() - i-1);
                        }
                        
                        if(s2.length() - i-1 < 0)
                        {
                            value2 = '0';
                        }else
                        {
                            value2 = s2.charAt(s2.length()- i - 1) ;
                        }
			int sumTwoChar = value1 -'0' + value2 - '0' + balance;
			balance = sumTwoChar / 10;
			result += ""+(sumTwoChar % 10);
		}
		
		return result;
	}
}
