package no.ssb.cleancode.teamcobra_x;

import  java.util.Random ;

public class RandomService {
	
	private int diceSize = 6 ;
	private Random random ;
	
	public RandomService(int diceSize) {
		this.diceSize=diceSize ;
		// Default don't use seed
		random = new Random() ;
	}
	
	// For reproduction&testing, seed for random generator may be applied
	public void initRand(int seed) {
		  random.setSeed((long) seed) ;
		
	}
	
	
	public  int unifRandInt(int min, int max) {
	    int randomNum = random.nextInt((max - min) + 1) + min;
	    return randomNum;
	}
	
	public int unifRandInt(int n) {
		
		return unifRandInt(1,n ) ;
	}
	
	public int throwDice() {
		
		return unifRandInt(1,diceSize) ;
	}
	

}
