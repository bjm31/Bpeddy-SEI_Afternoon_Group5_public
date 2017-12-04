import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Label;

import javax.imageio.ImageIO;
import java.io.IOException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.io.File;

public class PlayerSelection {
	
  public JFrame selectionFrame;

  public JButton choice1;

  public JButton choice2;

  public JButton choice3;

  private Dimension frameSize;
  
  public PlayerSelection(JFrame jFrame, JButton jButton1, JButton jButton2, JButton jButton3) {

  }

  public PlayerSelection(Dimension frameSize) {
	  
	  this.frameSize = frameSize;
	  setSelectionFrame(frameSize);
  }

  public JFrame getSelectionFrame() {
	  
	  return selectionFrame;
  }

  public void setSelectionFrame(Dimension frameSize) {
	  selectionFrame = new JFrame("Player Selection");
	  selectionFrame.setSize(frameSize);
	  selectionFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	  
	  JButton choice1 = new JButton("Select");
	  choice1.setSize(100,200);
	  JButton choice2 = new JButton("Select");
	  JButton choice3 = new JButton("Select");
	  
	  JPanel selectionPanel1 = new JPanel(new GridLayout(2,3, 50, 1));
	  selectionPanel1.setBackground(java.awt.Color.black);
	  JLabel label1 = new JLabel();
	  JLabel label2 = new JLabel();
	  JLabel label3 = new JLabel();
	  try {
		  label1 = new JLabel((Icon)new ImageIcon(ImageIO.read(new File ("C:\\Users\\bjm31\\OneDrive\\YODA-FIGURE.png"))));
		  label2 = new JLabel((Icon)new ImageIcon(ImageIO.read(new File ("C:\\Users\\bjm31\\OneDrive\\YODA-FIGURE.png"))));
		  label3 = new JLabel((Icon)new ImageIcon(ImageIO.read(new File ("C:\\Users\\bjm31\\OneDrive\\YODA-FIGURE.png"))));
	  }
	  catch (IOException e)
	  {
		  e.printStackTrace();
	  }
	  selectionPanel1.add(label1);
	  selectionPanel1.add(label2);
	  selectionPanel1.add(label3);
	  selectionPanel1.add(choice1);
	  selectionPanel1.add(choice2);
	  selectionPanel1.add(choice3);
	  
	  selectionFrame.add(selectionPanel1);
	  
	  System.out.println(selectionFrame.getSize().toString());
	  
  }

  public JButton getChoice1() {
  return null;
  }

  public void setChoice1(JButton jButton) {
	  
  }

  public JButton getChoice2() {
  return null;
  }

  public void setChoice2(JButton jButton) {
  }

  public JButton getChoice3() {
  return null;
  }

  public void setChoice3(JButton jButton) {
  }

}
