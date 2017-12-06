import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PlayingEnvironment {

  private Region region;

  private Dimension frameSize;
  
  public PlayingEnvironment(Region region, Dimension frameSize) {
	  this.region = region;
	  this.frameSize = frameSize;
	  this.regionImage = regionImage;
	  
	  createPlayingEnvironment();
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
	  playingFrame.setSize(getFrameSize());
	  
	  GridLayout gridLayout = new GridLayout(10,20);
	  
	  for (int r = 1; r <= gridLayout.getRows(); r++) {
		  for int (c = 1; c <= gridLayout.getColumns(); c++) {
			  JPanel cellPanel = new JPanel();
			  JButton cellButton = new JButton(r + "," + c);
			  cellPanel.add(cellButton);
		  }
	  }
	  
	  playingFrame.add(gridLayout);
	  playingFrame.setVisible(true);
  }

}
