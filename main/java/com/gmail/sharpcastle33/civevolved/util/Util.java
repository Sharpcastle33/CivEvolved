package com.gmail.sharpcastle33.civevolved.util;

import java.util.Random;

public class Util {
	public static boolean chance(int x){
		Random rand = new Random();
		if((x + rand.nextInt(100 - x + 1) > x)){
			return true;
		}else return false;
	}
}
