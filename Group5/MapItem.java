import javax.swing.Icon;
import javax.swing.JLabel;

public class MapItem {

  private int xPos;

  private int yPos;
  
  public MapItem(int xPos, int yPos) {
	  this.xPos = xPos;
	  this.yPos = yPos;
  }

  public int getXPos() {
	  return xPos;
  }

  public void setXPos(int xPos) {
	  this.xPos = xPos;
  }

  public int getYPos() {
	  return yPos;
  }

  public void setYPos(int yPos) {
	  this.yPos = yPos;
  }
  
  public Icon getImage() {
	return null;
}

}
