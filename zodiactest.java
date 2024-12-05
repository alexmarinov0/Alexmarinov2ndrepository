// Alex Marinov 
package zodiacsign;

import java.util.Scanner;

public class zodiactest {
	
	
	public static void main(String[] args) {
		System.out.println("See what your zodiac sign is!");
		System.out.println("Type the month and date you were born as numbers with a space in between.");
		Scanner keyboard = new Scanner(System.in);
		
		int month = keyboard.nextInt();
		int day = keyboard.nextInt(); 
		
		getZodiacSign(month, day);
		
		keyboard.close();
	}
	
	public static String getZodiacSign(int month, int day) {
		
		if (month < 1 || month > 12)
			System.out.println("invalid month");
		
		if (day <1 || day >31)
			System.out.println("invalid day");
		
		//why does month have a space between == but day doesnt
		if ((month == 2 && day >29) || (month == 4 && day >30) || (month == 6 && day >30) || (month == 9 && day >30) || (month == 11 && day >30))
			System.out.println("invalid day for the month");
		

		//do i use system.out.println or return 
		
		if((month == 1 && day >= 20) || (month == 2 && day <= 18))
		{
			System.out.println("Your zodiac sign is Aquarius");
		} else if ((month == 2 && day >=19) || (month == 3 && day <= 20))
		{
			System.out.println("Your zodiac sign is Pisces");
		} else if ((month == 3 && day >=21) || (month == 4 && day <= 19))
		{
			System.out.println("Your zodiac sign is Aries");
		} else if ((month == 4 && day >=20) || (month == 5 && day <=20))
		{
			System.out.println("Your zodiac sign is Taurus");
		} else if ((month == 5 && day >=21) || (month == 6 && day <=20))
		{
			System.out.println("Your zodiac sign is Gemini");
		} else if ((month == 6 && day >=21) || (month == 7 && day <=22))
		{
			System.out.println("Your zodiac sign is Cancer");
		} else if ((month == 7 && day >=23) || (month == 8 && day <=22))
		{
			System.out.println("Your zodiac sign is Leo");
		} else if ((month == 8 && day >=23) || (month == 9 && day <=22))
		{
			System.out.println("Your zodiac sign is Virgo");
		} else if ((month == 9 && day >=23) || (month == 10 && day <=22))
		{
			System.out.println("Your zodiac sign is Libra");
		} else if ((month == 10 && day >=23) || (month == 11 && day <=21))
		{
			System.out.println("Your zodiac sign is Scorpio");
		} else if ((month == 11 && day >=22) || (month == 12 && day <=21))
		{
			System.out.println("Your zodiac sign is Sagittarius");
		} else if ((month == 12 && day >=22) || (month == 1 && day <=19))
		{
			System.out.println("Your zodiac sign is Capricorn");
		}  
			
		return "unknown ";
	}

}
