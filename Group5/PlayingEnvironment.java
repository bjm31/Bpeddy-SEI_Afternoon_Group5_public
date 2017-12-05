import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class PlayingEnvironment {

  private Region region;

  private Dimension frameSize;

  private JLabel regionImage;
  
  public PlayingEnvironment(Region region, Dimension frameSize, JLabel regionImage) {
	  this.region = region;
	  this.frameSize = frameSize;
	  this.regionImage = regionImage;
  }

  public Region getRegion() {
	  return region;
  }

  public void setRegion(Region region) {
	  this.region = region;
  }

  public JLabel getRegionImage() {
	  return regionImage;
  }

  public void setRegionImage(JLabel regionImage) {
	  this.regionImage = regionImage;
  }

  public Dimension getFrameSize() {
	  return frameSize;
  }

  public void setFrameSize(Dimension frameSize) {
	  this.frameSize = frameSize;
  }

}
