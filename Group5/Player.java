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

  private ArrayList<Force> forceList;

  private String gameDataFileName;

  private int experience;

  private int currency;

  public Player(JLabel playerPortrait) {
	  
	  this.playerPortrait = playerPortrait;
	  
	 //Region region = new Region(new JLabel((Icon)new ImageIcon(ImageIO.read(new File ("download.png")))), 
	 //setRegionList(new ArrayList<Region>().add(region));
	  
  }
  
  public JLabel getPlayerPortrait() {
    return playerPortrait;
  }

  public void setPlayerPortrait(JLabel playerPortrait) {
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
