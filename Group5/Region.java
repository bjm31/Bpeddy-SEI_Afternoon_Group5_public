import java.util.ArrayList;

import javax.swing.JLabel;

public class Region {
	
	private JLabel regionImage;

	private ArrayList<MapItem> mapItemList;

	private ArrayList<Diplomat> diplomatList;

	private ArrayList<Mission> missionList;
  
	private int reputation;

  public Region(JLabel regionImage, ArrayList<Diplomat> diplomatList, ArrayList<MapItem> mapItemList, ArrayList<Mission> missionList, int reputation) {
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

}
