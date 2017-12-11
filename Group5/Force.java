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

}
