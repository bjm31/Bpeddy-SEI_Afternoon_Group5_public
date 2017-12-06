public class Force {

  private int attack;

  private int defense;

  private int stamina;
  
  private String name;

  public Force(String name, int attack, int defense, int stamina) {
	  setForceName(name);
	  setAttack(attack);
	  setDefense(defense);
	  setStamina(stamina);
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

}
