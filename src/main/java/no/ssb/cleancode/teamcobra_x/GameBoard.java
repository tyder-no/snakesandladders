package no.ssb.cleancode.teamcobra_x;

public interface GameBoard {
	public void setDiceSize(int diceSize) ;
	public int getDim() ;
	public int getPos(int currPos) ;
	public int getPos(int currPos, int incr) ;
	public void showNextCells(int currPos) ;
	public int boardFreeAndAllowedPos(int pos) ;
	public int addSmallLadder(int cnt) ;
	public int addLargeLadder(int cnt) ;
	public int addSmallSnake(int cnt) ;
	public int addLargeSnake(int cnt) ;
	public int addJump(int stPosRng, int jumpSizeRng, int jumpDirection) ;


}
