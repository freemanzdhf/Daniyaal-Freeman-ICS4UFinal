package Board;
import java.util.LinkedList;
import java.util.List;

import Piece.King;
import Piece.Piece;
import Player.Player;

public class Game {
	
	private Board board;
	private Player p1;
	private Player p2;
	private Player curPlayer;
	private LinkedList<Move> moves;

	// POTENTIAL CONSTANTS
//  GAME_ON
//	BLACK_WIN,
//	WHITE_WIN,
//	FORFEIT,
//	STALEMATE,
//	RESIGNATION
	
	public Game() {
		board = new Board();
		moves = new LinkedList<Move>();
		board.resetBoard();
		if(p1.isWhite())
			this.curPlayer = p1;
		else
			this.curPlayer = p2;
		moves.clear();
	}
	
	public boolean gameOver() {
		return false;
	}
	
	// Determine start and end spot
	public boolean movePlayer(Player player, int xStart, int yStart, int xEnd, int yEnd) throws IndexOutOfBoundsException {
		Spot startSpot = board.getSpot(xStart, yStart);
		Spot endSpot = board.getSpot(xEnd, yEnd);
		Move move = new Move(player, startSpot, endSpot);
		return canMove(move, player);
	}
	
	// Can it move to that spot?
	private boolean canMove(Move move, Player player) {
		return false;
	}
	
}