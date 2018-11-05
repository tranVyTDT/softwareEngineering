public class MyBigNumber
{
	
	public String sum(String s1 , String s2)
	{
		int balance = 0;
		int maxLenght = s1.length > s2.length ? s1.length : s2.length;
		String result;
		
		for(int i = 0 ; i < maxLenght : i++)
		{
			int sumTwoChar = (s1.charAr(s1.length - i-1) - 30) - (s2.charAr(s2.length - i-1) - 30) + balance;
			balance = sumTwoChar % 10;
			result += ""+sumTwoChar/10;
		}
		
		return result;
	}
}