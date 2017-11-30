import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

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
	  setSelectionFrame(framesize);
  }

  public JFrame getSelectionFrame() {
	  
	  return selectionFrame;
  }

  public void setSelectionFrame(Dimension frameSize) {
	  selectionFrame = new JFrame("Player Selection");
	  
	  selectionFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	  selectionFrame.setBackground(Color.black);
	  selectionFrame.setPreferredSize(frameSize);
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
