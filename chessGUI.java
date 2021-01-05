package Board;

import java.awt.Color;

// Names: Daniyaal Farooqi and Freeman Huang
// Due Date: 
// Class Name: ChessGUI
// Function: Chess Game with all usual functionalities plus a scoreboard; also allows for both multiplayer and vs. CPU
import javax.swing.*;

public class chessGUI {

	public static JFrame chessFrame;
	public static JPanel chessPanel;
	public static JButton[][] chessBoardButtons = new JButton[8][8];

	public chessGUI() {
		chessFrame = new JFrame("Chess Board");
		chessPanel = new JPanel();

	}

	public static void main(String[] args) {
		new chessGUI();
		int bwCounter = 0;
		for (int vert = 0; vert <= chessBoardButtons.length; vert++) {
			for (int hor = 0; hor <= chessBoardButtons[vert].length; hor++) {
				if (vert % 2 == 0) {
					if (hor % 2 == 0) {
						chessBoardButtons[vert][hor].setBackground(Color.BLACK);
					} else {
						chessBoardButtons[vert][hor].setBackground(Color.WHITE);
					}

				} else {
					if (hor % 2 == 0) {
						chessBoardButtons[vert][hor].setBackground(Color.WHITE);
					} else {
						chessBoardButtons[vert][hor].setBackground(Color.BLACK);
					}
				}
				chessPanel.add(chessBoardButtons[vert][hor]);
			}
		}
	}

}