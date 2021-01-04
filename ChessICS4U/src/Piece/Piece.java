package Piece;
import Board.Board;
import Board.Spot;

public abstract class Piece {
	
	// DATA
	private boolean alive = true;
	private boolean white;
	
	// Purpose:
	// Parameters:
	public Piece (boolean white) {
		this.white = white;
	}

	// GETTERS
	
	public boolean isAlive() {
		return alive;
	}

	public boolean isWhite() {
		return white;
	}
	
	// SETTERS

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

	public void setWhite(boolean white) {
		this.white = white;
	}
	
	// Abstract Method; Used in classes extending Piece (King, Pawn etc.)
	public abstract boolean canMove(Board board, Spot start, Spot end);
	
}