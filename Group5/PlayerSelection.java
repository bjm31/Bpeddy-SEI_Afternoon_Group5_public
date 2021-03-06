import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
  
  private JLabel title;
  private JLabel label1;
  private JLabel label2;
  private JLabel label3;
  private JLabel portrait1;
  private JLabel portrait2;
  private JLabel portrait3;
  
  private Player player;
  
  private JPanel selectionPanel;
  private JPanel backPanel;

  private static JButton backButton;
  private JButton choice1;
  private JButton choice2;
  private JButton choice3;
  
  private Dimension frameSize;
  private Dimension titleSize;
  private Dimension maxButtonSize;
  
  private GridBagConstraints constraints;
  
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
	  selectionFrame.add(addTitle());
	  selectionFrame.add(addBackPanel());
	  selectionFrame.add(addSelectionPanel());
	  selectionFrame.setVisible(true);
	  System.out.println(selectionFrame.getSize().toString());
	  
  }

  public void selectionButton1Pressed()
  {
	  portrait1 = new JLabel();
	  try {
		  portrait1 = new JLabel((Icon)new ImageIcon(ImageIO.read(new File ("Portrait1.jpg"))));
	  }
	  catch (IOException e)
	  {
		  e.printStackTrace();
	  }
	  player = new Player(portrait1);
	  selectionFrame.dispose();
	  new ShipHubMenu(frameSize, player);
  }
  
  public void selectionButton2Pressed()
  {
	  portrait2 = new JLabel();
	  try {
		  portrait2 = new JLabel((Icon)new ImageIcon(ImageIO.read(new File ("Portrait2.jpg"))));
	  }
	  catch (IOException e)
	  {
		  e.printStackTrace();
	  }
	  player = new Player(portrait2);
	  selectionFrame.dispose();
	  new ShipHubMenu(frameSize, player);
  }
  
  public void selectionButton3Pressed()
  {
	  portrait3 = new JLabel();
	  try {
		  portrait3 = new JLabel((Icon)new ImageIcon(ImageIO.read(new File ("Portrait3.jpg"))));
	  }
	  catch (IOException e)
	  {
		  e.printStackTrace();
	  }
	  player = new Player(portrait3);
	  selectionFrame.dispose();
	  new ShipHubMenu(frameSize, player);
  }
  
  public void backButtonPressed()
  {
	  selectionFrame.dispose();
	  new GameLaunch();
  }
  
  public JPanel addSelectionPanel()
  {
	  choice1 = new JButton("Select");
	  choice2 = new JButton("Select");
	  choice3 = new JButton("Select");

	  choice1.addActionListener(new ActionListener() 
	  	{ public void actionPerformed(ActionEvent e) 
	  		{ selectionButton1Pressed(); 
	  	} 
	  } );
	  choice2.addActionListener(new ActionListener() 
	  	{ public void actionPerformed(ActionEvent e) 
	  		{ selectionButton2Pressed(); 
	  	} 
	  } );
	  choice3.addActionListener(new ActionListener() 
	  	{ public void actionPerformed(ActionEvent e) 
	  		{ selectionButton3Pressed(); 
	  	} 
	  } );
	  
	  selectionPanel = new JPanel(new GridBagLayout());
	  constraints = new GridBagConstraints();
	  selectionPanel.setBackground(java.awt.Color.black);
	  
	  label1 = new JLabel();
	  label2 = new JLabel();
	  label3 = new JLabel();
	  try {
		  label1 = new JLabel((Icon)new ImageIcon(ImageIO.read(new File ("alien1.jpg"))));
		  label2 = new JLabel((Icon)new ImageIcon(ImageIO.read(new File ("alien2.jpg"))));
		  label3 = new JLabel((Icon)new ImageIcon(ImageIO.read(new File ("alien3.jpg"))));
	  }
	  catch (IOException e)
	  {
		  e.printStackTrace();
	  }
	  
	  constraints.insets = new Insets(0,25,0,0);
	  constraints.weightx = 0.5;
	  constraints.gridx = 0;
	  constraints.gridy = 0;
	  selectionPanel.add(label1, constraints);
	  constraints.weightx = 0.5;
	  constraints.gridx = 1;
	  constraints.gridy = 0;
	  selectionPanel.add(label2, constraints);
	  constraints.weightx = 0.5;
	  constraints.gridx = 2;
	  constraints.gridy = 0;
	  selectionPanel.add(label3, constraints);
	  constraints.insets = new Insets(25,0,0,0);
	  constraints.weightx = 0.5;
	  constraints.gridx = 0;
	  constraints.gridy = 1;
	  selectionPanel.add(choice1, constraints);
	  constraints.weightx = 0.5;
	  constraints.gridx = 1;
	  constraints.gridy = 1;
	  selectionPanel.add(choice2, constraints);
	  constraints.weightx = 0.5;
	  constraints.gridx = 2;
	  constraints.gridy = 1;
	  selectionPanel.add(choice3, constraints);
	  return selectionPanel;
  }
  
  public JLabel addTitle()
  {
	  title = new JLabel("Character Selection");
	  title.setFont(new Font(title.getName(), Font.BOLD, 50));
	  title.setForeground(java.awt.Color.white);
	  titleSize = title.getPreferredSize();
	  title.setBounds((int) (frameSize.getWidth() / 2 - titleSize.getWidth() / 2), (int) frameSize.getHeight() / 90,
				(int) titleSize.getWidth(), (int) titleSize.getHeight());
	  return title;
  }
  
  public JPanel addBackPanel()
  {
	  backButton = new JButton("Back");
	  maxButtonSize = backButton.getPreferredSize();
	  backButton.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  backButtonPressed();
		  }
	  } );
	  backPanel = new JPanel();
	  backPanel.setOpaque(false);
	  backPanel.add(backButton);
	  backPanel.setBounds((int) (frameSize.getWidth() - maxButtonSize.getWidth() / 2 - 50), (int) (frameSize.getHeight() - maxButtonSize.getHeight() / 2 - 60),
	    		(int) (maxButtonSize.getWidth()), (int) ((maxButtonSize.getHeight())) * 3);
	  return backPanel;
  }

}
