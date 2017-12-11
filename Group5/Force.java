public class Force {

  private int attack;

  private int defense;

  private int stamina;
  
  private int experience;
  
  private String name;

  public Force(String name, int attack, int defense, int stamina) {
	  this.setForceName(name);
	  this.setAttack(attack);
	  this.setDefense(defense);
	  this.setStamina(stamina);
	  this.setExperience();
  }

  private void setForceName(String name) {
	  this.name = name;
  }
  
  public String getForceName() {
	  return this.name;
  }
  
  public int getAttack() {
	  return attack;
  }

  private void setAttack(int attack) {
	  this.attack = attack;
  }

  public int getDefense() {
	  return defense;
  }

  private void setDefense(int defense) {
	  this.defense = defense;
  }

  public int getStamina() {
	  return stamina;
  }

  private void setStamina(int stamina) {
	  this.stamina = stamina;
  }
  
  public int getExperience() {
	  return this.experience;
  }
  
  public void setExperience() {
	  this.experience = ((this.getAttack() + this.getDefense() + this.getStamina())*2);
  }
  
  public Force fightNPC(Force opposingForce) {
	  int stam = this.getStamina();
	  int opposingStam = opposingForce.getStamina();
	  
	  do {
		  opposingStam -= (this.getAttack() / opposingForce.getDefense());
		  stam -= (opposingForce.getAttack() / this.getDefense());
		  System.out.println("enemyStam = " + stam + ", playerStam = " + opposingStam);
	  } while(opposingStam > 0 && stam > 0);
	  
	  if (stam <= 0) {
		  return this;
	  }
	  else
	  {
		  return opposingForce;
	  }
  }

}
