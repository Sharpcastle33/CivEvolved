package com.gmail.sharpcastle33.civevolved.util;

import java.util.Random;

public class Util {
	public static boolean chance(int x){
		if(x > randInt(0,100)){
			return true;
		}else return false;
	}
	
	public static int randInt(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
}
