package dicegame;

//Imports
import java.io.*;
import javax.swing.*;
import java.awt.image.*;
import java.awt.Image;
import javax.imageio.ImageIO;

//Dice Game
class DiceGameMain extends JFrame
{
	//Constructor
	public DiceGameMain()
	{
		//Set window properties
		setTitle("Dice Game");
		setSize(300,300);
		setLocation(50,50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);

		//Set Icon Image
		ImageIcon img = new ImageIcon("./Dice_6.png");
		setIconImage(img.getImage());

		//Add picture to main panel
		JLabel label = new JLabel();
		label.setSize(100,100);
		label.setLocation(50,50);

		BufferedImage bimg = null;
		try {
   			bimg = ImageIO.read(new File("./Dice_6.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dimg = bimg.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(dimg);
		label.setIcon(imageIcon);
		add(label);
	}

	//Main
	public static void main(String[] args)
	{
		//Create a new initial window and set the attributes
		DiceGameMain dgm = new DiceGameMain(); 
		dgm.setVisible(true);
	}
}
