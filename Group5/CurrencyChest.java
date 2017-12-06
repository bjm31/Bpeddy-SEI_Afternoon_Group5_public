import java.awt.Point;
import java.util.ArrayList;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class CurrencyChest extends MapItem {

  private Icon image;

  public int currency;

  public CurrencyChest(int xPos, int yPos, Icon image, int currency) {
	  super(xPos,yPos);
	  this.setImage(image);
	  this.currency = currency;
  }

  public int getCurrency() {
	  return currency;
  }

  public void setCurrency(int currency) {
	  this.currency = currency;
  }

  public Icon getImage() {
	return image;
  }

  public void setImage(Icon image) {
	this.image = image;
  }
  
  public int accessChest(Region region, Point chestPoint) {
	  removeChest(region,chestPoint);
	  return getCurrency();
  }

  private void removeChest(Region region, Point chestPoint) {
	  MapItem item = region.findMapItem(chestPoint.x, chestPoint.y);
	  region.getMapItemList().remove(item);
  }

}
