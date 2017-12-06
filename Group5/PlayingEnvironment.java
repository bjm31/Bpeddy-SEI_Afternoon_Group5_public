import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlayingEnvironment {

  private Region region;

  private Dimension frameSize;
  
  public PlayingEnvironment(Region region, Dimension frameSize) {
	  this.region = region;
	  this.frameSize = frameSize;
	  
	  createPlayingFrame();
  }

  public Region getRegion() {
	  return region;
  }

  public void setRegion(Region region) {
	  this.region = region;
  }

  public Dimension getFrameSize() {
	  return frameSize;
  }

  public void setFrameSize(Dimension frameSize) {
	  this.frameSize = frameSize;
  }
  
  public void createPlayingFrame() {
	  
	  JFrame playingFrame = new JFrame();
	  playingFrame.setContentPane(region.getRegionImage());
	  playingFrame.setSize(getFrameSize());
	  
	  JPanel buttonPanel = new JPanel();
	  buttonPanel.setOpaque(false);
	  buttonPanel.setSize(getFrameSize());
	  buttonPanel.setLayout(new GridLayout(10,20));
	  
	  for (int r = 0; r < 10; r++) {
		  for (int c = 0; c < 20; c++) {
			  JButton cellButton = new JButton(r + "," + c);
			  cellButton.setOpaque(false);
			  cellButton.setContentAreaFilled(false);
			  buttonPanel.add(cellButton);
		  }
		  
	  }
	  
	  playingFrame.add(buttonPanel);
	  playingFrame.setVisible(true);
  }

}
