import javax.swing.Icon;
import javax.swing.JLabel;

public class EnemyNPC extends MapItem {

  private Force force;

  private Icon image;

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
  
  public Force fightNPC(Force playerForce) {
	  int enemyStam = force.getStamina();
	  int playerStam = playerForce.getStamina();
	  
	  do {
		  playerStam -= (force.getAttack() / playerForce.getDefense());
		  enemyStam -= (playerForce.getAttack() / force.getDefense());
		  System.out.println("enemyStam = " + enemyStam + ", playerStam = " + playerStam);
	  } while(enemyStam > 0 && playerStam > 0);
	  
	  if (enemyStam <= 0) {
		  return force;
	  }
	  else
	  {
		  return playerForce;
	  }
  }
  

}
