import java.util.ArrayList;

public class Diplomat {

  private String dialogue;

  private Mission mission;

  private ArrayList<Force> forceList;

  public Diplomat(String dialogue, Mission mission, ArrayList<Force> forceList) {
	  this.dialogue = dialogue;
	  this.mission = mission;
	  this.forceList = forceList;
  }

  public String getDialogue() {
	  return dialogue;
  }

  public void setDialogue(String dialogue) {
	  this.dialogue = dialogue;
  }

  public Mission getMission() {
	  return mission;
  }

  public void setMission(Mission mission) {
	  this.mission = mission;
  }

  public ArrayList<Force> getForceList() {
	  return forceList;
  }

  public void setForceList(ArrayList<Force> forceList) {
	  this.forceList = forceList;
  }

}
