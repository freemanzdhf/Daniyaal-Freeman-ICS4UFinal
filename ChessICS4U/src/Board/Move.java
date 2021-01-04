package Board;
import Piece.Piece;
import Player.Player;

public class Move {
	
	// DATA
	
	private Player player; 
    private Spot start; 
    private Spot end;
	private Piece pieceMoved; 
    private Piece pieceKilled; 
    private boolean castlingMove; 
  
    // Purpose:
    // Parameters: 
    public Move(Player player, Spot start, Spot end) 
    { 
        this.player = player; 
        this.start = start; 
        this.end = end; 
        this.pieceMoved = start.getPiece(); 
    } 
    
    // GETTERS
    
    public Player getPlayer() {
		return player;
	}

	public Spot getEnd() {
		return end;
	}

	public Spot getStart() {
		return start;
	}

	public Piece getPieceMoved() {
		return pieceMoved;
	}

	public Piece getPieceKilled() {
		return pieceKilled;
	}
	
    public boolean isCastlingMove() 
    { 
        return this.castlingMove; 
    } 
  
    // SETTERS

	public void setPlayer(Player player) {
		this.player = player;
	}

	public void setEnd(Spot end) {
		this.end = end;
	}
	
	public void setStart(Spot start) {
		this.start = start;
	}

	public void setPieceMoved(Piece pieceMoved) {
		this.pieceMoved = pieceMoved;
	}

	public void setPieceKilled(Piece pieceKilled) {
		this.pieceKilled = pieceKilled;
	}

    public void setCastlingMove(boolean castlingMove) 
    { 
        this.castlingMove = castlingMove; 
    } 
    
}