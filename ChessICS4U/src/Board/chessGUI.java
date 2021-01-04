package Board;
// Names: Daniyaal Farooqi and Freeman Huang
// Due Date: 
// Class Name: ChessGUI
// Function: Chess Game with all usual functionalities plus a scoreboard; also allows for both multiplayer and vs. CPU
import javax.swing.*;

public class chessGUI {

	public static JFrame chessFrame;

	public static JPanel chessPanel;

	public chessGUI() {
		chessFrame = new JFrame("Chess Board");
		chessPanel = new JPanel();
	}

	public static void main(String[] args) {
		new chessGUI();
	}

}