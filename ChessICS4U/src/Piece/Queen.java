package Piece;

import Board.Board;
import Board.Spot;

public class Queen extends Piece{
	public Queen(boolean isWhite) {
		super(isWhite);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean canMove(Board board, Spot start, Spot end) {
		// TODO Auto-generated method stub
		return false;
	}
}
