import javax.swing.JFrame;
import java.awt.*;

public class MainMenu extends JFrame
{
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;

	public MainMenu()
	{
		//Instantiate the labels:
		timeLimit = new JLabel("Enter the time limit in minutes: ", SwingConstants.RIGHT);
		moneyGoal = new JLabel("Enter the amount goal: ", SwingConstants.RIGHT);

		//Text fields next:
		timeLimit = new JTextField(10);
		moneyGoal = new JTextField(10);


		//Buttons too:
		play = new JButton("Play");
		exitB = new JButton("Exit");

		//Set the window's title.
		setTitle("Add Click: Battle Royal");

		//Get the content pane (CP).
		Container pane = getContentPane();

		//Set the layout.
		pane.setLayout(new GridLayout(5, 2));

		//Other JFrame stuff.
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
