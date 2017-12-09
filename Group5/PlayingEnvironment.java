import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class PlayingEnvironment {

  private Region region;

  private Dimension frameSize;
  
  private Player player;
  
  private Point current;
  
  private JButton[][] buttons;
  
  private JFrame playingFrame;
  
  private Force enemy;
  
  ArrayList<Point> enemyPoints = new ArrayList<Point>();
  ArrayList<Point> chestPoints = new ArrayList<Point>();
  ArrayList<Point> allyPoints = new ArrayList<Point>();
  
  public PlayingEnvironment(Player player, Region region, Dimension frameSize) {
	  
	  this.player = player;
	  
	  setRegion(region);
	  setFrameSize(frameSize);
	  
	  createPlayingFrame();
  }

  public Region getRegion() {
	  return region;
  }

  public void setRegion(Region region) {
	  this.region = region;
  }

  public Dimension getFrameSize() {
	  return frameSize;
  }

  public void setFrameSize(Dimension frameSize) {
	  this.frameSize = frameSize;
  }
  
  private void createPlayingFrame() {
	  
	  playingFrame = new JFrame();
	  playingFrame.setContentPane(region.getRegionImage());
	  playingFrame.setSize(getFrameSize());
	  
	  JPanel buttonPanel = new JPanel();
	  buttonPanel.setOpaque(false);
	  buttonPanel.setSize(getFrameSize());
	  buttonPanel.setLayout(new GridLayout(10,20));
	  
	  buttons = new JButton[10][20];
	  
	  ButtonListener listener = new ButtonListener();
	  
	  for (int r = 0; r < 10; r++) {
		  for (int c = 0; c < 20; c++) {
			  JButton cellButton = new JButton(r + "," + c);
			  cellButton.setOpaque(false);
			  cellButton.setContentAreaFilled(false);
			  buttons[r][c] = cellButton;
			  buttons[r][c].addActionListener(listener);
			  buttonPanel.add(cellButton);
		  }
		  
	  }
	  
	  current = new Point(19,9);
	  
	  playingFrame.add(buttonPanel);
	  
	  loadMapItems();
	  System.out.println(enemyPoints.toString());
	  playingFrame.setVisible(true);
  }
  
  private void loadMapItems() {
	  
	  buttons[9][19].setIcon(player.getPlayerPortrait().getIcon()); 
	  
	  for (MapItem item : region.getMapItemList()) {
		buttons[item.getYPos()][item.getXPos()].setIcon(item.getImage());
		
		if (item instanceof EnemyNPC) {
			enemyPoints.add(new Point(item.getXPos(),item.getYPos()));
		}
		
		else if (item instanceof CurrencyChest || item instanceof BoostChest) {
			chestPoints.add(new Point(item.getXPos(),item.getYPos()));
		}
		
		else {
			allyPoints.add(new Point(item.getXPos(),item.getYPos()));
		}
	  }
	  
  }
  
  
  
  public boolean checkMove(int x, int y) {
	  int val = Math.abs(current.x - x) + Math.abs(current.y - y);
	  
	  return val == 1;
  }
  
  private boolean checkComplete() {
	  if (enemyPoints.isEmpty())
	  {
		  System.out.println(player.getForceList().toString());
		  return true;
	  }
	  else
		  return false;
  }
  
  private class ButtonListener implements ActionListener {
      public void actionPerformed(ActionEvent e) {
    	  
         JButton clicked = (JButton) e.getSource();
         
         for (int r = 0; r < 10; r++) {
            for (int c = 0; c < 20; c++) {
               if (clicked == buttons[r][c]) {
                  if (checkMove(c, r)) {
                	 buttons[current.y][current.x].setIcon(null);
                     current = new Point(c, r);
                     buttons[r][c].setIcon(player.getPlayerPortrait().getIcon());
                     for (Point p : enemyPoints) {
                    	 //if ((current.x - 1 == p.x && current.y == p.y) || (current.x == p.x && current.y + 1 == p.y)
                    		//	 || (current.x + 1 == p.x && current.y == p.y) || (current.x == p.x && current.y - 1 == p.y)) {
                    	if (current.equals(p)) {	 
                    		enemy = ((EnemyNPC) region.findMapItem(p.x, p.y)).fightNPC(player.getForce(0));
                    		 if (enemy != null) {
                    			 player.addExperience(enemy.getAttack() + enemy.getDefense() + enemy.getStamina());
                    			 enemyPoints.remove(p);
                    			 player.getForceList().add(enemy);
                    			 region.getMapItemList().remove(region.findMapItem(p.x, p.y));
                    			 break;
                    		 } 
                    	 }
                     }
                     
                     for (Point p : chestPoints) {
                    	 if (current.equals(p)) {
                    		 MapItem chest = region.findMapItem(current.x, current.y);
                    		 if (chest instanceof CurrencyChest) {
                    			 CurrencyChest currencyChest = (CurrencyChest) chest;
                    			 player.addCurrency(currencyChest.accessChest(region,current));
                    		 }
                    	 }
                     } 
                  } 
                  else {
                     System.out.println("INVALID MOVE");
                  }
               }
            }
         }
         if(checkComplete())
         {
        	 playingFrame.dispose();
     		 new ShipHubMenu(frameSize, player);
         }
      }
  }

}
