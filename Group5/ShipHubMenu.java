import java.awt.Dimension;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class ShipHubMenu {



  private MissionSelection missionSelection;

  private WorldStandingMenu worldStandingMenu;

  private ForceSelection forceSelection;
  
  private Dimension frameSize;
  
  private JFrame shipHubFrame;

  public ShipHubMenu(Dimension frameSize) {
		setShipHubMenuFrame(frameSize);
	}
  public void setShipHubMenuFrame(Dimension frameSize) {
	  shipHubFrame = new JFrame("Player Selection");
	  shipHubFrame.setSize(frameSize);
	  shipHubFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	  try {
			shipHubFrame.setContentPane(new JLabel((Icon) new ImageIcon(ImageIO.read(new File("ship.jpg")))));
	     	} catch (IOException e) {
	    		e.printStackTrace();
	   }
	  shipHubFrame.pack();
	  shipHubFrame.setVisible(true);
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
