import javax.swing.JLabel;

public class MapItem {

  private int xPos;

  private int yPos;

  private JLabel image;
  
  public MapItem(int xPos, int yPos, JLabel image) {
	  this.xPos = xPos;
	  this.yPos = yPos;
	  this.image = image;
  }

  public int getXPosition() {
	  return xPos;
  }

  public void setXPosition(int xPos) {
	  this.xPos = xPos;
  }

  public int getYPosition() {
	  return yPos;
  }

  public void setYPosition(int yPos) {
	  this.yPos = yPos;
  }

  public JLabel getImage() {
	  return image;
  }

  public void setImage(JLabel image) {
	  this.image = image;
  }

}
