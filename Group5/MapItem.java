

public class MapItem {

  private int xPos;

  private int yPos;
  
  public MapItem(int xPos, int yPos) {
	  this.xPos = xPos;
	  this.yPos = yPos;
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

}
