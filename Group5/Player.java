import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Player {

  private JLabel playerPortrait;

  private ArrayList<Region> regionList;

  private ArrayList<MapItem> itemList;

  private ArrayList<Force> forceList;

  private String gameDataFileName;

  private int experience;

  private int currency;
  
  private int level;

  public Player(JLabel playerPortrait) throws IOException {
	  
	  setPlayerPortrait(playerPortrait);
	  setPlayerLevel(1);
	  setPlayerExperience(0);
	  setPlayerCurrency(0);
	  
	  Mission mission = new Mission(50, 10000, "Defeat one North American force.", false);
	  EnemyNPC enemyNPC = new EnemyNPC(10, 10, new JLabel((Icon)new ImageIcon(ImageIO.read(new File ("enemy_force.jpg")))), new Force(3, 3, 12));
	  CurrencyChest currencyChest = new CurrencyChest(15, 10, new JLabel((Icon)new ImageIcon(ImageIO.read(new File ("map_chest.jpg")))), 5000);
	  
	  Region region = new Region("North America", new JLabel((Icon)new ImageIcon(ImageIO.read(new File ("download.png")))), new ArrayList<Diplomat>(), new ArrayList<Force>(),
			  new ArrayList<MapItem>(), new ArrayList<Mission>(), 0);
	  region.getMapItemList().add(enemyNPC);
	  region.getMapItemList().add(currencyChest);
	  region.getMissionList().add(mission);
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
    return null;
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
}
