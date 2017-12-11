import java.util.ArrayList;
import javax.swing.JLabel;

public class Player {

  private JLabel playerPortrait;

  private ArrayList<Region> regionList;

  private ArrayList<MapItem> itemList;

  private ArrayList<Force> forceList = new ArrayList<Force>();

  private String gameDataFileName;

  private int experience;

  private int currency;
  
  private int level;

  public Player(JLabel playerPortrait) {
	  
	  this.setPlayerPortrait(playerPortrait);
	  this.setPlayerLevel(1);
	  this.setPlayerExperience(0);
	  this.setPlayerCurrency(0);
	  
	  forceList.add(new Force("Beginner Force", 10, 10, 100));
	  
  }
  
  public JLabel getPlayerPortrait() {
    return playerPortrait;
  }
  
  public int getPlayerLevel() {
	  return level;
  }
  
  public int getPlayerExperience() {
	  return experience;
  }
  
  public int getPlayerCurrency() {
	  return currency;
  }
  
  private void setPlayerLevel(int level) {
	  this.level = level;
  }
  
  private void setPlayerExperience(int experience) {
	  this.experience = experience;
  }
  
  private void setPlayerCurrency(int currency) {
	  this.currency = currency;
  }

  private void setPlayerPortrait(JLabel playerPortrait) {
	  this.playerPortrait = playerPortrait;
  }

  public ArrayList<Region> getRegionList() {
    return regionList;
  }

  public void setRegionList(ArrayList<Region> regionList) {
	  this.regionList = regionList;
  }

  private ArrayList<MapItem> getItemList() {
    return itemList;
  }

  public void setItemList(ArrayList<MapItem> itemList) {
  }

  public ArrayList<Force> getForceList() {
    return forceList;
  }
  
  public Force getForce(int i) {
	  return forceList.get(i);
  }
  
  public int getForceAttack(int i) {
	  return forceList.get(i).getAttack();
  }
  
  public int getForceDefense(int i) {
	  return forceList.get(i).getDefense();
  }
  
  public int getForceStamina(int i) {
	  return forceList.get(i).getStamina();
  }

  public void setForceList(ArrayList<Force> forceList) {
	  this.forceList = forceList;
  }

  public String getGameDataFileName() {
    return null;
  }

  public void setGameDataFileName(String gameDataFileName) {
  }

  public int getExperience() {
    return experience;
  }

  private void setExperience(int experience) {
	  this.experience = experience;
  }

  public int getCurrency() {
    return currency;
  }

  public void setCurrency(int currency) {
	  this.currency = currency;
  }
  
  public void changeWorldStanding(Region region, int reputation) {
  }
  
  public void addExperience(int experience) {
	  this.experience += experience;
	  if (this.getExperience() > 100 && this.getPlayerLevel() == 1)
	  {
		  this.experience -= 100;
		  addPlayerLevel(1);
	  }
	  if (this.getExperience() > 200 && this.getPlayerLevel() == 2)
	  {
		  this.experience -= 200;
		  addPlayerLevel(1);
	  }
	  if (this.getExperience() > 300 && this.getPlayerLevel() == 3)
	  {
		  this.experience -= 300;
		  addPlayerLevel(1);
	  }
	  if (this.getExperience() > 400 && this.getPlayerLevel() == 4)
	  {
		  this.experience -= 400;
		  addPlayerLevel(1);
	  }
	  if (this.getExperience() > 500 && this.getPlayerLevel() == 5)
	  {
		  this.experience -= 500;
		  addPlayerLevel(1);
	  }
  }
  
  public void addPlayerLevel(int level) {
	  this.level += level;
  }
  
  public void addCurrency(int currency) {
	  this.currency += currency;
  }
}
