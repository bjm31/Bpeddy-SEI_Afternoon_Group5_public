import javax.swing.JLabel;

public class EnemyNPC extends MapItem {

  public Force force;

  public JLabel image;

  public EnemyNPC(int xPos, int yPos, JLabel image, Force force) {
	  super(xPos,yPos);
	  this.image = image;
	  this.force = force;
  }

  public int fightNPC() {
	  return 0;
  }
  
  public JLabel getImage() {
	  return image;
  }

  public void setImage(JLabel image) {
	  this.image = image;
  }
  
  public Force getForce() {
	  return force;
  }

  public void setForce(Force force) {
	  this.force = force;
  }

}