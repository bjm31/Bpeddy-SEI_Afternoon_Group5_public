
public class WorldMap {

  private JLabel mapImage;
  
  private ArrayList<Region> regionList;

  public WorldMap(JLabel mapImage, ArrayList<Region> regionList) {
	  this.mapImage = mapImage;
	  this.regionList = regionList;
  }

  public JLabel getMapImage() {
	  return mapImage;
  }

  public void setMapImage(JLabel mapImage) {
  }

  public ArrayList<Region> getRegionList() {
	  return regionList;
  }

  public void setRegionList(ArrayList<Region> regionList) {
	  this.regionList = regionList;
  }

}
