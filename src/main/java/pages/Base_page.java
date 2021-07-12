package pages;

import java.util.Random;

public class Base_page {

	
	public int  randomvalue () {
		
		Random rand = new Random();
		int randomvalue = rand.nextInt(100);
		return randomvalue;
		
	}
}
