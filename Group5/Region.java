import java.util.ArrayList;

import javax.swing.JLabel;

public class Region {
	
	private String regionName;
	
	private JLabel regionImage;

	private ArrayList<MapItem> mapItemList;
	
	private ArrayList<Diplomat> diplomatList;

	private ArrayList<Mission> missionList;
  
	private int reputation;

  public Region(String regionName, JLabel regionImage, ArrayList<Diplomat> diplomatList, ArrayList<Force> forceList, ArrayList<MapItem> mapItemList, ArrayList<Mission> missionList, int reputation) {
	  this.regionName = regionName;
	  this.regionImage = regionImage;
	  this.diplomatList = diplomatList;
	  this.mapItemList = mapItemList;
	  this.missionList = missionList;
	  this.reputation = reputation;
  }

  public ArrayList<MapItem> getMapItemList() {
	  return mapItemList;
  }

  public void setMapItemList(ArrayList<MapItem> mapItemList) {
	  this.mapItemList = mapItemList;
  }

  public int getReputation() {
	  return reputation;
  }

  public void setReputation(int reputation) {
  }

  public ArrayList<Diplomat> getDiplomatList() {
	  return diplomatList;
  }

  public void setDiplomatList(ArrayList<Diplomat> diplomatList) {
	  this.diplomatList = diplomatList;
  }

  public ArrayList<Mission> getMissionList() {
	  return missionList;
  }

  public void setMissionList(ArrayList<Mission> missionList) {
	  this.missionList = missionList;
  }
  
  public void updateReputation(int reputation) {
	  this.reputation += reputation;
  }

  public JLabel getRegionImage() {
	return regionImage;
  }

  public void setRegionImage(JLabel regionImage) {
	this.regionImage = regionImage;
  }

  public String getRegionName() {
	return regionName;
  }

  public void setRegionName(String regionName) {
	this.regionName = regionName;
  }
  
  public MapItem findMapItem(int xPos, int yPos) {
	  for (MapItem item : getMapItemList()) {
		  if (item.getXPos() == xPos && item.getYPos() == yPos) {
			  return item;
		  }
	  }
	  return null;
  }

}
