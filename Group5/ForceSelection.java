import java.awt.Dimension;
import java.awt.Font;
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

private JLabel title;

private Dimension titleSize;

private JPanel buttonPanel;
  
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
		forceSelectionFrame.add(addTitle());
		forceSelectionFrame.add(addButtonPanel());
		System.out.println(forceSelectionFrame.getSize().toString());
	}
  
  public void backButtonPressed()
  {
	  forceSelectionFrame.dispose();
	  new ShipHubMenu(frameSize, player);
  }
  
  public JLabel addTitle()
	{
		title = new JLabel("Force Selection");
		title.setFont(new Font(title.getName(), Font.BOLD, 75));
		title.setForeground(java.awt.Color.white);
		titleSize = title.getPreferredSize();
		title.setBounds((int) (frameSize.getWidth() / 2 - titleSize.getWidth() / 2), (int) frameSize.getHeight() / 10,
				(int) titleSize.getWidth(), (int) titleSize.getHeight());
		return title;
	}
  
  public JPanel addButtonPanel()
	{
	  	buttonPanel = new JPanel();
	  	buttonPanel.setOpaque(false);
	  	int amount = 0;
	  	for (Force force : player.getForceList())
	  	{
	  		JButton button = new JButton(force.getForceName());
	  		JLabel label = player.getPlayerPortrait();
			maxButtonSize = button.getPreferredSize();
			button.setPreferredSize(maxButtonSize);
			buttonPanel.add(label);
			buttonPanel.add(button);
			amount += 6;
	  	}
		buttonPanel.setBounds((int) (frameSize.getWidth() / 2 - maxButtonSize.getWidth() / 2), (int) (frameSize.getHeight() / 2 - maxButtonSize.getHeight() / 2),
				(int) (maxButtonSize.getWidth()), (int) ((maxButtonSize.getHeight())) * amount);
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
