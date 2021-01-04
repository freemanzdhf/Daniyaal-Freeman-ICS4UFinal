package Piece;
import Board.Board;
import Board.Spot;

public class Knight extends Piece {

	// Purpose:
	// Parameters:
	public Knight(boolean isWhite) {
		super(isWhite);
	}

	// Purpose:
	// Parameters:
	// Returns:
	@Override
	public boolean canMove(Board board, Spot start, Spot end) {
		// Can't move to spot with same colour
		if (end.getPiece().isWhite() == this.isWhite())
			return false;

		int x = Math.abs(start.getXPos() - end.getXPos());
		int y = Math.abs(start.getYPos() - end.getYPos());
		// Only way a Knight can move is if this is true
		return x * y == 2;
	}

}