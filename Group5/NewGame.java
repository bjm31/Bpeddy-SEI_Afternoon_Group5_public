import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

public class NewGame implements ActionListener {

  private PlayerSelection playerSelection;

  private Player player;

  private ShipHubMenu shipHubMenu;
  
  private Dimension frameSize;
  
  private JFrame launchFrame;
  
  public NewGame(JFrame launchFrame, Dimension frameSize) {
	  
	  this.launchFrame = launchFrame;
	  this.frameSize = frameSize;
  }

  public NewGame(PlayerSelection playerSelection, Player player, ShipHubMenu shipHubMenu) {
  }

  public void createSaveData() {
  }

  public void createSaveFile() {
  }

  public ShipHubMenu load() {
  return null;
  }

  public void createNew() {
  }

  public PlayerSelection loadChoices() {
  return null;
  }

  public Player saveCharacter() {
  return null;
  }

  @Override
  public void actionPerformed(ActionEvent e) {
	  launchFrame.setVisible(false);
	  playerSelection = new PlayerSelection(frameSize);
	  playerSelection.getSelectionFrame();
	  
  }
}
