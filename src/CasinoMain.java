package casino;

/*
#  File: CasinoMain.java
#  Type: Java Source File
#  Date: February 2, 2017
#
#  Description:
#  This is the main class for the Casino.
*/

//Imports
import java.io.*;
import javax.swing.*;
import java.awt.image.*;
import java.awt.Image;
import javax.imageio.ImageIO;

//Dice Game
class CasinoMain extends JFrame
{
 private static final long serialVersionUID = 9483247;

	//Constructor
	public CasinoMain()
	{
		//Set window properties
		setTitle("Casino");
		setSize(600,300);
		setLocation(50,50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		setResizable(false);

		//Set Icon Image
		ImageIcon img = new ImageIcon("./img/Dice_6.png");
		setIconImage(img.getImage());

		//Add picture to main panel
		JLabel label = new JLabel();
		label.setSize(100,100);
		label.setLocation(50,50);

		BufferedImage bimg = null;
		try {
   			bimg = ImageIO.read(new File("./img/Dice_6.png"));
		} catch (IOException e) {
		    e.printStackTrace();
		}
		Image dimg = bimg.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(dimg);
		label.setIcon(imageIcon);
		add(label);

		//Add Games Drop Down Box
		String[] gamesList = { "Select a Game...", "Dice Roll", "TBD" };
		JComboBox<String> gameListBox = new JComboBox<>(gamesList);
		gameListBox.setSelectedIndex(0);
		gameListBox.setSize(150,30);
		gameListBox.setLocation(440, 10);
		add(gameListBox);
	}

	//Main
	public static void main(String[] args)
	{
		//Create a new initial window and set the attributes
		CasinoMain dgm = new CasinoMain(); 
		dgm.setVisible(true);
	}
}
