import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.Vector;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class SaveGame {
	
	  private Player player;
	  
	  private Dimension frameSize;
	  
	  private JFrame saveGameFrame;

	  private JButton backButton;

	private Dimension maxButtonSize;

	private JPanel backPanel;

	private JButton saveAndContinueButton;

	private JButton saveAndMainButton;

	private JButton saveAndExitButton;

	private JPanel buttonPanel;
	  
	  public SaveGame(Dimension frameSize, Player player) {
			this.player = player;
			this.frameSize = frameSize;
			setSaveGameFrame(frameSize);
		}
	  
	  public void setSaveGameFrame(Dimension frameSize) {
		  	saveGameFrame = new JFrame("Force Selection");
		  	saveGameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
			try {
				saveGameFrame.setContentPane(new JLabel((Icon) new ImageIcon(ImageIO.read(new File("ship.jpg")))));
				} catch (IOException e) {
					e.printStackTrace();
			}
			saveGameFrame.pack();

			saveGameFrame.setVisible(true);
			saveGameFrame.setSize(frameSize);

			saveGameFrame.add(addBackPanel());
			saveGameFrame.add(addButtonPanel());
		  
			System.out.println(saveGameFrame.getSize().toString());
		}
	  
	  public void backButtonPressed()
	  {
		  saveGameFrame.dispose();
		  new ShipHubMenu(frameSize, player);
	  }
	  
	  public void saveAndContinueButtonPressed()
		{
		  	saveGameFrame.dispose();
			new ShipHubMenu(frameSize, player);
		}
	  
	  public void saveAndMainButtonPressed()
		{
		  	saveGameFrame.dispose();
			new GameLaunch();
		}
	  
	  public void saveAndExitButtonPressed()
		{
			saveGameFrame.dispose();
			System.exit(0);
		}
	  
	  public JPanel addButtonPanel()
		{
			saveAndContinueButton = new JButton("Save and Continue");
			saveAndMainButton = new JButton("Save and go to Main Menu");
			saveAndExitButton = new JButton("Save and Exit");
		  
			maxButtonSize = saveAndMainButton.getPreferredSize();
			saveAndExitButton.setPreferredSize(maxButtonSize);
			saveAndContinueButton.setPreferredSize(maxButtonSize);
		  
			saveAndContinueButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					saveAndContinueButtonPressed(); 
				} 
			} );
			saveAndMainButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					saveAndMainButtonPressed(); 
				} 
			} );
			saveAndExitButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					saveAndExitButtonPressed(); 
				} 
			} );
		  
			buttonPanel = new JPanel();
			buttonPanel.setOpaque(false);
			buttonPanel.add(saveAndContinueButton);
			buttonPanel.add(saveAndMainButton);
			buttonPanel.add(saveAndExitButton);
			buttonPanel.setBounds((int) (frameSize.getWidth() / 2 - maxButtonSize.getWidth() / 2), (int) (frameSize.getHeight() / 2 - maxButtonSize.getHeight() / 2),
					(int) (maxButtonSize.getWidth()), (int) ((maxButtonSize.getHeight())) * 5);
			return buttonPanel;
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
