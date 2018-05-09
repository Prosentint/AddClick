import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class MainMenu extends JFrame
{
	private static final int WIDTH = 400;
	private static final int HEIGHT = 300;

	private JLabel lengthL, widthL, areaL;
	private JTextField lengthTF, widthTF, areaTF;
	private JButton calculateB, exitB;

	//Button handlers:
	private CalculateButtonHandler cbHandler;
	private ExitButtonHandler ebHandler;

	public RectangleProgram()
	{
		timeLimit = new JLabel("Enter the time limit desired for game in minutes: ", SwingConstants.RIGHT);
		numberGoal = new JLabel("Enter the number goal deseired for game: ", SwingConstants.RIGHT);

		timeTF = new JTextField(10);
		goalTF = new JTextField(10);


		//SPecify handlers for each button and add (register) ActionListeners to each button.
		playB = new JButton("Play");
		cbHandler = new CalculateButtonHandler();
		calculateB.addActionListener(cbHandler);
		exitB = new JButton("Exit");
		ebHandler = new ExitButtonHandler();
		exitB.addActionListener(ebHandler);

		setTitle("Sample Title: Area of a Rectangle");
		Container pane = getContentPane();
		pane.setLayout(new GridLayout(4, 2));

		//Add things to the pane in the order you want them to appear (left to right, top to bottom)
		pane.add(timeLimit);
		pane.add(timeTF);
		pane.add(numberGoalL);
		pane.add(goalTF);
		pane.add(playB);
		pane.add(exitB);

		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	private class CalculateButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			double width, length, area;

			length = Double.parseDouble(lengthTF.getText()); //We use the getText & setText methods to manipulate the data entered into those fields.
			width = Double.parseDouble(widthTF.getText());
			area = length * width;

			areaTF.setText("" + area);
		}
	}

	public class ExitButtonHandler implements ActionListener
	{
		public void actionPerformed(ActionEvent e)
		{
			System.exit(0);
		}
	}

	public static void main(String[] args)
	{
		RectangleProgram rectObj = new RectangleProgram();
	}

}
