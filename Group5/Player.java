public class Player {

  private BufferedImage playerPortrait;

  private ArrayList<Region> regionList;

  private ArrayList<Item> itemList;

  private ArrayList<Force> forceList;

  private String gameDataFileName;

  private int experience;

  private int currency;

  public void Player(BufferedImage playerPortrait, ArrayList<Region> regionList, ArrayList<Item> itemList, 
                     ArrayList<Force> forceList, String gameDataFileName, int experience, int currency) {
  }

  public void changeWorldStanding(Region region, int reputation) {
  }

  public BufferedImage getPlayerPortrait() {
    return null;
  }

  public void setPlayerPortrait(BufferedImage playerPortrait) {
  }

  public ArrayList<Region> getRegionList() {
    return null;
  }

  public void setRegionList(ArrayList<Region> regionList) {
  }

  private ArrayList<item> getItemList() {
    return null;
  }

  public void setItemList(ArrayList<Item> itemList) {
  }

  public ArrayList<Force> getForceList() {
    return null;
  }

  public void setForceList(ArrayList<Force> forceList) {
  }

  public String getGameDataFileName() {
    return null;
  }

  public void setGameDataFileName(String gameDataFileName) {
  }

  public int getExperience() {
    return 0;
  }

  public void setExperience(int experience) {
  }

  public int getCurrency() {
    return 0;
  }

  public void setCurrency(int currency) {
  }
}
