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

public class ShipHubMenu {

	private static JButton missionSelectionButton;
	private static JButton forceSelectionButton;
	private static JButton worldStandingButton;
	private static JButton saveButton;
	private JPanel shipPanel;
	private JLabel title;
	
  private MissionSelection missionSelection;

  private WorldStandingMenu worldStandingMenu;

  private ForceSelection forceSelection;
  
  private Dimension frameSize;
  
  private JFrame shipHubFrame;

  public ShipHubMenu(Dimension frameSize) {
		setShipHubMenuFrame(frameSize);
	}
  public void setShipHubMenuFrame(Dimension frameSize) {
	  shipHubFrame = new JFrame("Ship Hub");
	  shipHubFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	  try {
			shipHubFrame.setContentPane(new JLabel((Icon) new ImageIcon(ImageIO.read(new File("ship.jpg")))));
	     	} catch (IOException e) {
	    		e.printStackTrace();
	   }
	  shipHubFrame.pack();

	  shipHubFrame.setVisible(true);
	  shipHubFrame.setSize(frameSize);
	  
	  title = new JLabel("Ship Hub");
	  title.setFont(new Font(title.getName(), Font.BOLD, 100));
	  title.setForeground(java.awt.Color.white);
	  
	  Dimension titleSize = title.getPreferredSize();
	  
	  title.setBounds((int) (frameSize.getWidth() / 2 - titleSize.getWidth() / 2), (int) frameSize.getHeight() / 10,
				(int) titleSize.getWidth(), (int) titleSize.getHeight());
	  
	  missionSelectionButton = new JButton("Mission Selection");
	  worldStandingButton = new JButton("View World Standing");
	  forceSelectionButton = new JButton("View Forces");
	  saveButton = new JButton("Save");
	  
	  Dimension maxButtonSize = worldStandingButton.getPreferredSize();
	  missionSelectionButton.setPreferredSize(maxButtonSize);
	  forceSelectionButton.setPreferredSize(maxButtonSize);
	  saveButton.setPreferredSize(maxButtonSize);
	  
	  missionSelectionButton.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
	  		missionSelectionButtonPressed(); 
	  		} 
	  } );
	  worldStandingButton.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
	  		worldStandingButtonPressed(); 
	  		} 
	  } );
	  forceSelectionButton.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
	  		forceSelectionButtonPressed(); 
	  		} 
	  } );
	  saveButton.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
	  		saveButtonPressed(); 
	  		} 
	  } );
	  
	  shipPanel = new JPanel();
	  shipPanel.setOpaque(false);
	  shipPanel.add(missionSelectionButton);
	  shipPanel.add(worldStandingButton);
	  shipPanel.add(forceSelectionButton);
	  shipPanel.add(saveButton);
	  shipPanel.setBounds((int) (frameSize.getWidth() / 2 - maxButtonSize.getWidth() / 2), (int) (frameSize.getHeight() / 2 - maxButtonSize.getHeight() / 2),
	    		(int) (maxButtonSize.getWidth()), (int) ((maxButtonSize.getHeight())) * 5);
	  
	  shipHubFrame.add(shipPanel);
	  shipHubFrame.add(title);
	  
	  System.out.println(shipHubFrame.getSize().toString());
  }

  public void missionSelectionButtonPressed()
  {
	  shipHubFrame.dispose();
	  new ShipHubMenu(frameSize);
  }
  
  public void forceSelectionButtonPressed()
  {
	  shipHubFrame.dispose();
	  new ShipHubMenu(frameSize);
  }
  
  public void worldStandingButtonPressed()
  {
	  shipHubFrame.dispose();
	  new ShipHubMenu(frameSize);
  }
  
  public void saveButtonPressed()
  {
	  shipHubFrame.dispose();
	  new ShipHubMenu(frameSize);
  }

  public MissionSelection getMissionSelection() {
    return null;
  }

  public void setMissionSelection(MissionSelection missionSelection) {
  }

  public WorldStandingMenu getWorldStandingMenu() {
    return null;
  }

  public void setWorldStandingMenu(WorldStandingMenu worldStandingMenu) {
  }

  public ForceSelection getForceSelection() {
    return null;
  }

  public void setForceSelection(ForceSelection forceSelection) {
  }

  public void save() {
  }

}
