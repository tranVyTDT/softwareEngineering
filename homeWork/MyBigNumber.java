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
		int balance = 0; 
                char value1 , value2;
		int maxLenght = s1.length() > s2.length() ? s1.length() : s2.length();
		String result = "";
		
		for(int i = 0 ; i < maxLenght ; i++) 
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
