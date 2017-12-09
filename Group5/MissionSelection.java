import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class MissionSelection {
  
  private static JButton region1Mission1Button;
  private static JButton region2Mission1Button;
  private static JButton region3Mission1Button;
  private static JButton region4Mission1Button;
  private static JButton region5Mission1Button;
  private static JButton backButton;
  
  private JPanel region1MissionPanel;
  private JPanel region2MissionPanel;
  private JPanel region3MissionPanel;
  private JPanel region4MissionPanel;
  private JPanel region5MissionPanel;
  private JPanel backPanel;
  
  private JLabel title;
  private JLabel region1Title;
  private JLabel region2Title;
  private JLabel region3Title;
  private JLabel region4Title;
  private JLabel region5Title;
  
  private Dimension frameSize;
  private Dimension maxButtonSize;
  private Dimension titleSize;
  
  private Player player;
  
  private JFrame missionSelectionFrame;

  public MissionSelection(Dimension frameSize, Player player) {
	  this.frameSize = frameSize;
	  this.player = player;
	  setMissionSelectionFrame(frameSize);
  }
  
  public void setMissionSelectionFrame(Dimension frameSize) {
	  missionSelectionFrame = new JFrame("Mission Selection");
	  missionSelectionFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
	  
	  try {
			missionSelectionFrame.setContentPane(new JLabel((Icon) new ImageIcon(ImageIO.read(new File("World_Map_Basic.png")))));
	     	} catch (IOException e) {
	    		e.printStackTrace();
	   }	
	  
	  missionSelectionFrame.pack();

	  missionSelectionFrame.setVisible(true);
	  missionSelectionFrame.setSize(frameSize);
	  
	  missionSelectionFrame.add(addRegion1MissionPanel());
	  missionSelectionFrame.add(addRegion2MissionPanel());
	  missionSelectionFrame.add(addRegion3MissionPanel());
	  missionSelectionFrame.add(addRegion4MissionPanel());
	  missionSelectionFrame.add(addRegion5MissionPanel());
	  missionSelectionFrame.add(addTitle());
	  missionSelectionFrame.add(addBackPanel());
	  
	  System.out.println(missionSelectionFrame.getSize().toString());
  }
  
  public void region1Mission1ButtonPressed() throws IOException
  {
	  missionSelectionFrame.dispose();
	  
	  Mission mission = new Mission(50, 10000, "Defeat one North American force.", false);
	  EnemyNPC enemyNPC1 = new EnemyNPC(10, 3, new ImageIcon("enemy_force_button.jpg"), new Force("NA Force",3, 3, 12));
	  EnemyNPC enemyNPC2 = new EnemyNPC(10, 4, new ImageIcon("enemy_force_button.jpg"), new Force("NA Force",3, 3, 12));
	  EnemyNPC enemyNPC3 = new EnemyNPC(10, 5, new ImageIcon("enemy_force_button.jpg"), new Force("NA Force",3, 3, 12));
	  EnemyNPC enemyNPC4 = new EnemyNPC(10, 6, new ImageIcon("enemy_force_button.jpg"), new Force("NA Force",3, 3, 12));
	  EnemyNPC enemyNPC5 = new EnemyNPC(10, 7, new ImageIcon("enemy_force_button.jpg"), new Force("NA Force",3, 3, 12));
	  EnemyNPC enemyNPC6 = new EnemyNPC(10, 8, new ImageIcon("enemy_force_button.jpg"), new Force("NA Force",3, 3, 12));
	  CurrencyChest currencyChest = new CurrencyChest(15, 6, new ImageIcon("map_chest_button.jpg"), 5000);
	  
	  Region region = new Region("North America", new JLabel((Icon)new ImageIcon(ImageIO.read(new File ("download.png")))), new ArrayList<Diplomat>(), 
			  new ArrayList<Force>(), new ArrayList<MapItem>(), new ArrayList<Mission>(), 0);
	  region.getMapItemList().add(enemyNPC1);
	  region.getMapItemList().add(enemyNPC2);
	  region.getMapItemList().add(enemyNPC3);
	  region.getMapItemList().add(enemyNPC4);
	  region.getMapItemList().add(enemyNPC5);
	  region.getMapItemList().add(enemyNPC6);
	  region.getMapItemList().add(currencyChest);
	  region.getMissionList().add(mission);
	  
	  new PlayingEnvironment(player, region, frameSize);
  }
  
  public void region2Mission1ButtonPressed()
  {
	  missionSelectionFrame.dispose();
	  new MissionSelection(frameSize, player);
  }
  
  public void region3Mission1ButtonPressed()
  {
	  missionSelectionFrame.dispose();
	  new MissionSelection(frameSize, player);
  }
  
  public void region4Mission1ButtonPressed()
  {
	  missionSelectionFrame.dispose();
	  new MissionSelection(frameSize, player);
  }
  
  public void region5Mission1ButtonPressed()
  {
	  missionSelectionFrame.dispose();
	  new MissionSelection(frameSize, player);
  }
  
  public void backButtonPressed()
  {
	  missionSelectionFrame.dispose();
	  new ShipHubMenu(frameSize, player);
  }
  
  public JLabel addTitle()
  {
	  title = new JLabel("Mission Selection");
	  title.setFont(new Font(title.getName(), Font.BOLD, 25));
	  title.setForeground(java.awt.Color.white);
	  titleSize = title.getPreferredSize();
	  title.setBounds((int) (frameSize.getWidth() / 2 - titleSize.getWidth() / 2), (int) frameSize.getHeight() / 25,
				(int) titleSize.getWidth(), (int) titleSize.getHeight());
	  return title;
  }
  
  public JPanel addRegion1MissionPanel()
  {
	  region1Mission1Button = new JButton("Mission 1");
	  region1Title = new JLabel("Region 1");
	  region1Title.setFont(new Font(region1Title.getName(), Font.BOLD, 18));
	  region1Title.setForeground(java.awt.Color.white);
	  maxButtonSize = region1Mission1Button.getPreferredSize();
	  region1Mission1Button.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  try {
				region1Mission1ButtonPressed();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} 
	  		} 
	  } );
	  region1MissionPanel = new JPanel();
	  region1MissionPanel.setOpaque(false);
	  region1MissionPanel.add(region1Title);
	  region1MissionPanel.add(region1Mission1Button);
	  region1MissionPanel.setBounds((int) (frameSize.getWidth() / 8 - maxButtonSize.getWidth() / 2), (int) (frameSize.getHeight() / 8 - maxButtonSize.getHeight() / 2),
	    		(int) (maxButtonSize.getWidth()), (int) ((maxButtonSize.getHeight())) * 3);
	  return region1MissionPanel;
  }
  
  public JPanel addRegion2MissionPanel()
  {
	  region2Mission1Button = new JButton("Mission 1");
	  region2Title = new JLabel("Region 2");
	  region2Title.setFont(new Font(region2Title.getName(), Font.BOLD, 18));
	  region2Title.setForeground(java.awt.Color.white);
	  maxButtonSize = region2Mission1Button.getPreferredSize();
	  region2Mission1Button.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  region2Mission1ButtonPressed(); 
	  		} 
	  } );
	  region2MissionPanel = new JPanel();
	  region2MissionPanel.setOpaque(false);
	  region2MissionPanel.add(region2Title);
	  region2MissionPanel.add(region2Mission1Button);
	  region2MissionPanel.setBounds((int) (frameSize.getWidth() / 5 - maxButtonSize.getWidth() / 2), (int) (frameSize.getHeight() / 2 - maxButtonSize.getHeight() / 2),
	    		(int) (maxButtonSize.getWidth()), (int) ((maxButtonSize.getHeight())) * 3);
	  return region2MissionPanel;
  }
  
  public JPanel addRegion3MissionPanel()
  {
	  region3Mission1Button = new JButton("Mission 1");
	  region3Title = new JLabel("Region 3");
	  region3Title.setFont(new Font(region3Title.getName(), Font.BOLD, 18));
	  region3Title.setForeground(java.awt.Color.white);
	  maxButtonSize = region3Mission1Button.getPreferredSize();
	  region3Mission1Button.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  region3Mission1ButtonPressed(); 
	  		} 
	  } );
	  region3MissionPanel = new JPanel();
	  region3MissionPanel.setOpaque(false);
	  region3MissionPanel.add(region3Title);
	  region3MissionPanel.add(region3Mission1Button);
	  region3MissionPanel.setBounds((int) (frameSize.getWidth() / 2 - maxButtonSize.getWidth() / 2 - 30), (int) (frameSize.getHeight() / 2 - maxButtonSize.getHeight() / 2 - 50),
	    		(int) (maxButtonSize.getWidth()), (int) ((maxButtonSize.getHeight())) * 3);
	  return region3MissionPanel;
  }
  
  public JPanel addRegion4MissionPanel()
  {
	  region4Mission1Button = new JButton("Mission 1");
	  region4Title = new JLabel("Region 4");
	  region4Title.setFont(new Font(region4Title.getName(), Font.BOLD, 18));
	  region4Title.setForeground(java.awt.Color.white);
	  maxButtonSize = region4Mission1Button.getPreferredSize();
	  region4Mission1Button.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  region4Mission1ButtonPressed(); 
	  		} 
	  } );
	  region4MissionPanel = new JPanel();
	  region4MissionPanel.setOpaque(false);
	  region4MissionPanel.add(region4Title);
	  region4MissionPanel.add(region4Mission1Button);
	  region4MissionPanel.setBounds((int) (frameSize.getWidth() / 2 - maxButtonSize.getWidth() / 2 + 100), (int) (frameSize.getHeight() / 8 - maxButtonSize.getHeight() / 2),
	    		(int) (maxButtonSize.getWidth()), (int) ((maxButtonSize.getHeight())) * 3);
	  return region4MissionPanel;
  }
  
  public JPanel addRegion5MissionPanel()
  {
	  region5Mission1Button = new JButton("Mission 1");
	  region5Title = new JLabel("Region 5");
	  region5Title.setFont(new Font(region5Title.getName(), Font.BOLD, 18));
	  region5Title.setForeground(java.awt.Color.white);
	  maxButtonSize = region5Mission1Button.getPreferredSize();
	  region5Mission1Button.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  region5Mission1ButtonPressed(); 
	  		} 
	  } );
	  region5MissionPanel = new JPanel();
	  region5MissionPanel.setOpaque(false);
	  region5MissionPanel.add(region5Title);
	  region5MissionPanel.add(region5Mission1Button);
	  region5MissionPanel.setBounds((int) (frameSize.getWidth() - maxButtonSize.getWidth() / 2 - 300), (int) (frameSize.getHeight() / 2 - maxButtonSize.getHeight() / 2),
	    		(int) (maxButtonSize.getWidth()), (int) ((maxButtonSize.getHeight())) * 3);
	  return region5MissionPanel;
  }
  
  public JPanel addBackPanel()
  {
	  backButton = new JButton("Back");
	  maxButtonSize = backButton.getPreferredSize();
	  backButton.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  backButtonPressed();
		  }
	  } );
	  backPanel = new JPanel();
	  backPanel.setOpaque(false);
	  backPanel.add(backButton);
	  backPanel.setBounds((int) (frameSize.getWidth() - maxButtonSize.getWidth() / 2 - 50), (int) (frameSize.getHeight() - maxButtonSize.getHeight() / 2 - 60),
	    		(int) (maxButtonSize.getWidth()), (int) ((maxButtonSize.getHeight())) * 3);
	  return backPanel;
  }

}
