package Piece;
import Board.Board;
import Board.Spot;

public class Pawn extends Piece {

	public Pawn(boolean isWhite) {
		super(isWhite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canMove(Board board, Spot start, Spot end) {
		// TODO Auto-generated method stub
		return false;
	}

}
