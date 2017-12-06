import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ForceSelection {


  public JFrame forceMenuFrame;
  
  private Player player;
  
  private Dimension frameSize;
  
  private JFrame forceSelectionFrame;

  private JButton backButton;

private Dimension maxButtonSize;

private JPanel backPanel;
  
  public ForceSelection(Dimension frameSize, Player player) {
		this.player = player;
		this.frameSize = frameSize;
		setForceSelectionFrame(frameSize);
	}
  
  public void setForceSelectionFrame(Dimension frameSize) {
	  	forceSelectionFrame = new JFrame("Force Selection");
		forceSelectionFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		try {
			forceSelectionFrame.setContentPane(new JLabel((Icon) new ImageIcon(ImageIO.read(new File("ship.jpg")))));
			} catch (IOException e) {
				e.printStackTrace();
		}
		forceSelectionFrame.pack();

		forceSelectionFrame.setVisible(true);
		forceSelectionFrame.setSize(frameSize);

		forceSelectionFrame.add(addBackPanel());
	  
		System.out.println(forceSelectionFrame.getSize().toString());
	}
  
  public void backButtonPressed()
  {
	  forceSelectionFrame.dispose();
	  new ShipHubMenu(frameSize, player);
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
