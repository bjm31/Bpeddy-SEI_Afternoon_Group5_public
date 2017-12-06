import javax.swing.Icon;

public class AllyNPC extends MapItem {

  private Force force;

  private Icon image;

  public AllyNPC(int xPos, int yPos, Icon image, Force force) {
	  super(xPos,yPos);
	  setImage(image);
	  setForce(force);
  }

  public Force recruitNPC() {
    return null;
  }

  public Force getForce() {
    return force;
  }

  public void setForce(Force force) {
	  this.force = force;
  }

public Icon getImage() {
	return image;
}

public void setImage(Icon image) {
	this.image = image;
}

}
