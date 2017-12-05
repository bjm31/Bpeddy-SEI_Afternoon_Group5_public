public class Mission {

  private int reputation;

  private int currency;

  private String details;
  
  private boolean status;

  public Mission(int reputation, int currency, String details, boolean status) {
	  this.reputation = reputation;
	  this.currency = currency;
	  this.details = details;
	  this.status = status;
  }
  
  public void worldStandingLoss(Region region) {
	  region.updateReputation(reputation * -1);
  }

  public void worldStandingGain(Region region) {
	  region.updateReputation(reputation);
  }

  public int getReputation() {
	  return reputation;
  }

  public void setReputation(int reputation) {
	  this.reputation = reputation;
  }

  public int getCurrency() {
	  return currency;
  }

  public void setCurrency(int currency) {
	  this.currency = currency;
  }

  public String getDetails() {
	  return details;
  }

  public void setDetails(String details) {
	  this.details = details;
  }

  public boolean getStatus() {
	  return status;
  }
  
  public void setStatus(boolean status) {
	  this.status = status;
  }

}
