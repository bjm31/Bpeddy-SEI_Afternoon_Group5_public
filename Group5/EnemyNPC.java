import javax.swing.Icon;
import javax.swing.JLabel;

public class EnemyNPC extends MapItem {

  private Force force;

  private Icon image;

  public EnemyNPC(int xPos, int yPos, Icon image, Force force) {
	  super(xPos,yPos);
	  this.image = image;
	  this.force = force;
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
		  if(force.getAttack() > playerForce.getDefense()) {
			  playerStam -= (force.getAttack() - playerForce.getDefense());
		  }
		  if (playerForce.getAttack() > force.getDefense()) {
			  enemyStam -= (playerForce.getAttack() - force.getDefense());
		  }
		  System.out.println("enemyStam = " + enemyStam + ", playerStam = " + playerStam);
	  } while(enemyStam > 0 && playerStam > 0);
	  
	  if (enemyStam <= 0) {
		  return force;
	  }
	  
	  return null;
  }
  

}
