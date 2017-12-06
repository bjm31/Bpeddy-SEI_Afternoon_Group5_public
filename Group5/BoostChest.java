
public class BoostChest extends MapItem {

  private Icon image;

  private int boost;

  public void BoostChest(int xPos, int yPos, Icon image, int boost) {
    super(xPos,yPos);
    setImage(image);
    setBoost(boost);
  }

  public int accessChest() {
    return 0;
  }

  public void removeChest() {
  }

  public int getBoost() {
    return boost;
  }

  public void setBoost(int boost) {
    this.boost = boost;
  }

}
