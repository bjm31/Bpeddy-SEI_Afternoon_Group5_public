
public class BoostChest extends MapItem {

  private Icon image;

  private int boost;

  public void BoostChest(int xPos, int yPos, Icon image, int boost) {
    super(xPos,yPos);
    setImage(image);
    setBoost(boost);
  }
  
  public int getBoost() {
    return boost;
  }

  public void setBoost(int boost) {
    this.boost = boost;
  }
  
    public int accessChest(Region region, Point chestPoint) {
	  removeChest(region,chestPoint);
	  return getBoost();
  }

  private void removeChest(Region region, Point chestPoint) {
	  MapItem item = region.findMapItem(chestPoint.x, chestPoint.y);
	  region.getMapItemList().remove(item);
  }

}
