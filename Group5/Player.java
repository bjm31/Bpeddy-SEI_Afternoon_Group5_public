import java.io.File;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
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
	  
	  setPlayerPortrait(playerPortrait);
	  setPlayerLevel(1);
	  setPlayerExperience(0);
	  setPlayerCurrency(0);
	  
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

  public void setExperience(int experience) {
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
  }
  
  public void addCurrency(int currency) {
	  this.currency += currency;
  }
}
