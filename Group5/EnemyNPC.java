import javax.swing.Icon;
import javax.swing.JLabel;

public class EnemyNPC extends MapItem {

  private Force force;

  private Icon image;
  
  private int experience;

  public EnemyNPC(int xPos, int yPos, Icon image, Force force) {
	  super(xPos,yPos);
	  setImage(image);
	  setForce(force);
  }

  public Icon getImage() {
	  return image;
  }

  public void setImage(Icon image) {
	  this.image = image;
  }
  
  public Force getForce() {
	  return force;
  }

  public void setForce(Force force) {
	  this.force = force;
  }
  

}
