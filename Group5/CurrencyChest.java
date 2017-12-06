import java.util.Vector;

import javax.swing.JLabel;

public class CurrencyChest extends MapItem {

  private JLabel image;

  public int xPos;

  public int yPos;

  public int currency;

  public CurrencyChest(int xPos, int yPos, JLabel image, int currency) {
	  super(xPos,yPos);
	  this.image = image;
	  this.currency = currency;
  }

  public int getCurrency() {
	  return currency;
  }

  public void setCurrency(int currency) {
	  this.currency = currency;
  }
  
  public int accessChest() {
	  removeChest();
	  return getCurrency();
  }

  private void removeChest() {
	  image.setVisible(false);
  }

}