package Piece;
import Board.Board;
import Board.Spot;

public class King extends Piece {
	
	// DATA
	public boolean castlingDone;

	// Purpose:
	// Parameters:
	public King(boolean isWhite) {
		super(isWhite);
	}

	// Purpose:
	// Parameters:
	// Returns:
	@Override
	public boolean canMove(Board board, Spot start, Spot end) {
		// Can't move to GridSpot if piece there has same colour
		if (end.getPiece().isWhite() == this.isWhite())
			return false;
		
		int x = Math.abs(start.getXPos() - end.getXPos());
		int y = Math.abs(start.getYPos() - end.getYPos());
		if(x + y == 1)
			return true;
		
		// Allows for castling since its movement doesn't fall under above statements
		return this.isValidCastling(board, start, end);
		
	}
	
	// Purpose:
	// Parameters:
	// Returns:
	private boolean isValidCastling (Board board, Spot start, Spot end) {
		if(castlingDone)
			return false;
		return true;
	}
	
	// Purpose:
	// Parameters:
	// Returns:
	public boolean isCastlingMove(Spot start, Spot end) {
		// implement the castling functionality here / check if end/start pos is right
		return false;
	}
	
	// GETTERS
	
	public boolean isCastlingDone() {
		return castlingDone;
	}
	
	// SETTERS

	public void setCastlingDone(boolean castlingDone) {
		this.castlingDone = castlingDone;
	}
	

}
