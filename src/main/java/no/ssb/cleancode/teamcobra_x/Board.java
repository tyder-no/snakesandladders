package no.ssb.cleancode.teamcobra_x;

import java.util.Map ;
import java.util.HashMap;


public class Board implements GameBoard {

	private int diceSize = 6 ;
	private int boardDim = 100 ;
	private HashMap<Integer, Integer> board = new HashMap<Integer, Integer>();
    private RandomService randomService ;

	public Board(int boardDim, int diceSize, RandomService randomService) {
		this.diceSize = diceSize ;
		this.boardDim = boardDim ;
		this.randomService = randomService ;
		for (int i=1; i<=boardDim;i++) board.put(i, i) ;

	}

	public void setDiceSize(int diceSize) {

		this.diceSize = diceSize ;
	}

	public int getDim() {
		return boardDim ;
	}

	public int getPos(int currPos) {
		return board.get(currPos) ;
	}

	public int getPos(int currPos, int incr) {
		if (currPos+incr<=boardDim) return board.get(currPos+incr) ;
		else return board.get(2*boardDim - currPos - incr );
	}

	public void showNextCells(int currPos) {
		// TODO Auto-generated method stub
		System.out.println(diceSize);
	}

	public int boardFreeAndAllowedPos(int pos) {
		int currPos = 1 ; // First allowed pos is #2
		while ((currPos++<boardDim)&&(pos>0) ) 
			if (board.get(currPos)==currPos) pos-- ;
		if (currPos<boardDim) return currPos ;
		else return 0;
	}

	public int addSmallLadder(int cnt) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int addLargeLadder(int cnt) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int addSmallSnake(int cnt) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int addLargeSnake(int cnt) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int addJump(int stPosRng, int jumpSizeRng, int jumpDirection) {
		int stPos = randomService.unifRandInt(stPosRng) ;
		
		return 0;
	}

}
