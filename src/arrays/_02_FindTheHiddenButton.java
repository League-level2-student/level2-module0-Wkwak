/*****
 * 
 * Run the FndHdnBtn.jar to play the finished game
 * 
 *****/

package arrays;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _02_FindTheHiddenButton implements ActionListener {
	JFrame window;
	JPanel panel;

	// 1. create an array of JButtons. Don't initialize it yet.
	JButton[] buttons;
	// 2 create an int variable called hiddenButton
	int hiddenButton;

	public static void main(String[] args) {
		new _02_FindTheHiddenButton().start();
	}

	public void start() {
		window = new JFrame("Find the Button");
		panel = new JPanel();
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		Scanner scanner = new Scanner(System.in);
		// 3. Ask the user to enter a positive number and convert it to an int
		System.out.println("Enter a size for the array of JButtons");
		int input = scanner.nextInt();
		// 4. Initialize the array of JButtons to be the size of the int created in step
		buttons = new JButton[input];
		// 5. Make a for loop to iterate through the JButton array
		for (int pos = 0; pos < buttons.length; pos++) {
			// 6. initialize each JButton in the array
			buttons[pos] = new JButton();
			// 7. add the ActionListener to each JButton
			buttons[pos].addActionListener(this);
			// 8. add each JButton to the panel
			panel.add(buttons[pos]);
		}
		// 9 add the panel to the window
		window.add(panel);
		// 10. call setExtendedState(JFrame.MAXIMIZED_BOTH) on your JFrame object.
		window.setExtendedState(JFrame.MAXIMIZED_BOTH);
		// 11. set the JFrame to visible.
		window.setVisible(true);
		// 12. Give the user the instructions for the game.
		System.out.println("instructions");
		// 13. initialize the hiddenButton variable to a random number less than the int
		// created int step 3
		Random randy = new Random();
		int rand = randy.nextInt(input);
		hiddenButton = rand;
		// 14. Set the text of the JButton located at hiddenButton the read "ME"
		buttons[hiddenButton].setText("ME");
		// 15. Use Thread.sleep(100); to pause the program.
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// Surround it with a try/catch

		// 16. Set the text of the JButton located at hiddenButton to be blank.
		buttons[hiddenButton].setText("");

		window.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JButton buttonClicked = (JButton) e.getSource();

		// 17. if the hiddenButton is clicked, tell the user that they win.
		if (buttonClicked == buttons[hiddenButton]) {
			System.out.println("you win");
		} else {
			System.out.println("try again");
		}
		// 18. else tell them to try again
	}
}
