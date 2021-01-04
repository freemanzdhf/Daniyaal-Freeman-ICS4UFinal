package Board;
import Piece.Piece;

public class Spot {
	
	// DATA
	private Piece piece;
	private int xPos;
	private int yPos;
	
	// Purpose:
	// Parameters:
	public Spot(int xPos, int yPos, Piece piece) {
		this.xPos = xPos;
		this.yPos = yPos;
		this.piece = piece;
	}
	
	// GETTERS

	public Piece getPiece() {
		return piece;
	}

	public int getXPos() {
		return xPos;
	}

	public int getYPos() {
		return yPos;
	}
	
	// SETTERS

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public void setXPos(int xPos) {
		this.xPos = xPos;
	}

	public void setYPos(int yPos) {
		this.yPos = yPos;
	}
	
	

}
