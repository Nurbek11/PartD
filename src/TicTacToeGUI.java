
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


import java.awt.Font;
import java.awt.Color;

public class TicTacToeGUI extends JFrame {
private Container panel;
private String player;
private JButton [] [] board;
private boolean Winner, CheckDraw;
static String WINNER = "";

public TicTacToeGUI() {
	super();
	panel = getContentPane();
	panel.setLayout (new GridLayout (3,3));
	setTitle("Tic Tac Toe");
	setSize(500,500);
	setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	player = Demo.s1.getText();
	board = new JButton [3] [3];
	Winner = false;
	CheckDraw = false;
	initializeBoard();
	setVisible(true);
}

private void resetBoard() {
	player = Demo.s1.getText();
	Winner = false;
	CheckDraw = false;
	for(int i = 0; i<3; i++){
			for(int j = 0; j<3; j++) {
				board[i] [j].setText("");
			}
		}
}

private void initializeBoard() {
	for(int i = 0; i<3; i++) {
		for(int j = 0; j<3; j++) {
			JButton btn = new JButton();
			board[i] [j] = btn;
			btn.addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					if(((JButton)e.getSource()).getText().equals("") && 
					Winner == false && CheckDraw == false) {
				btn.setText(player);
				Font f = new Font("Arial", Font.BOLD,160);
				btn.setFont(f);
				if (player.equals(Demo.s1.getText())) {
					btn.setForeground(Color.red);
				}
				else if (player.equals(Demo.s2.getText())){
					btn.setForeground(Color.blue);
				}
				Winner();
				CheckDraw();
				changePlayer();
			}
					else if (((JButton) e.getSource()).getText().equals(WINNER)){
                        resetBoard(); 
						}
					else if (CheckDraw == true) {
						resetBoard();
					}
		}
	});
	panel.add(btn);
		}
	}
}

private void changePlayer() {
	if(player.equals(Demo.s1.getText()))
        player = Demo.s2.getText();
    else
        player = Demo.s1.getText();
}
private void CheckDraw() {
	
	int n = 0;
	for(int i = 0; i < board.length;i++)
		for(int j = 0; j < board[i].length;j++)
			if (board[i][j].getText().equals(Demo.s1.getText())||board[i][j].getText().equals(Demo.s2.getText())) {
			n++;
			}
	if (n == 9 && Winner == false){
				JOptionPane.showMessageDialog(null, "Draw");
				CheckDraw = true;
			}
	}
private void Winner() {
	if(board[0] [0].getText().equals(player) && board[1] [0].getText().equals(player) && board[2] [0].getText().equals(player)) {
		if (player.equals(Demo.s1.getText()))
        {player = Demo.p1.getText();
        WINNER = Demo.s1.getText();
        }
        else {player = Demo.p2.getText();
             WINNER = Demo.s2.getText();
        }
		JOptionPane.showMessageDialog(null, "Player " + player + " is a winner");
		Winner = true;
	}
	else if (board[0] [1].getText().equals(player) && board[1] [1].getText().equals(player) && board[2] [1].getText().equals(player)) {
		if (player.equals(Demo.s1.getText()))
        {player = Demo.p1.getText();
        WINNER = Demo.s1.getText();
        }
        else {player = Demo.p2.getText();
             WINNER = Demo.s2.getText();
        }
		JOptionPane.showMessageDialog(null, "Player " + player + " is a winner");
		Winner = true;
	}
	else if (board[0] [2].getText().equals(player) && board[1] [2].getText().equals(player) && board[2] [2].getText().equals(player)) {
		if (player.equals(Demo.s1.getText()))
        {player = Demo.p1.getText();
        WINNER = Demo.s1.getText();
        }
        else {player = Demo.p2.getText();
             WINNER = Demo.s2.getText();
        }
		JOptionPane.showMessageDialog(null, "Player " + player + " is a winner");
		Winner = true;
	}
	else if(board[0] [0].getText().equals(player) && board[0] [1].getText().equals(player) && board[0] [2].getText().equals(player)) {
		if (player.equals(Demo.s1.getText()))
        {player = Demo.p1.getText();
        WINNER = Demo.s1.getText();
        }
        else {player = Demo.p2.getText();
             WINNER = Demo.s2.getText();
        }
		JOptionPane.showMessageDialog(null, "Player " + player + " is a winner");
		Winner = true;
	}
	else if (board[1] [0].getText().equals(player) && board[1] [1].getText().equals(player) && board[1] [2].getText().equals(player)) {
		if (player.equals(Demo.s1.getText()))
        {player = Demo.p1.getText();
        WINNER = Demo.s1.getText();
        }
        else {player = Demo.p2.getText();
             WINNER = Demo.s2.getText();
        }
		JOptionPane.showMessageDialog(null, "Player " + player + " is a winner");
		Winner = true;
	}
	else if (board[2] [0].getText().equals(player) && board[2] [1].getText().equals(player) && board[2] [2].getText().equals(player)) {
		if (player.equals(Demo.s1.getText()))
        {player = Demo.p1.getText();
        WINNER = Demo.s1.getText();
        }
        else {player = Demo.p2.getText();
             WINNER = Demo.s2.getText();
        }
		JOptionPane.showMessageDialog(null, "Player " + player + " is a winner");
		Winner = true;	
		}
	else if (board[0] [0].getText().equals(player) && board[1] [1].getText().equals(player) && board[2] [2].getText().equals(player)) {
		if (player.equals(Demo.s1.getText()))
        {player = Demo.p1.getText();
        WINNER = Demo.s1.getText();
        }
        else {player = Demo.p2.getText();
             WINNER = Demo.s2.getText();
        }
		JOptionPane.showMessageDialog(null, "Player " + player + " is a winner");
		Winner = true;	
		}
	else if (board[0] [2].getText().equals(player) && board[1] [1].getText().equals(player) && board[2] [0].getText().equals(player)) {
		if (player.equals(Demo.s1.getText()))
        {player = Demo.p1.getText();
        WINNER = Demo.s1.getText();
        }
        else {player = Demo.p2.getText();
             WINNER = Demo.s2.getText();
        }
		JOptionPane.showMessageDialog(null, "Player " + player + " is a winner");
		Winner = true;	
		}

}

}
