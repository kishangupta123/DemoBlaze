package com.ecomm.genericUtilities;

import java.time.LocalDateTime;
import java.util.Random;

public class JavaUtility {
	/**
	 * 
	 * @return
	 */
	public String getLocalDateTime() {
		return LocalDateTime.now().toString().replace(":", "-");
	}
	
	/**
	 * 
	 * @return
	 */
	public int getRandomNumber() {
		Random rand = new Random();
		return rand.nextInt();
	}
}
