import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;

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
  
  private JPanel region1MissionPanel;
  private JPanel region2MissionPanel;
  
  private JLabel title;
  private JLabel region1Title;
  private JLabel region2Title;
  
  private Dimension frameSize;
  
  private JFrame missionSelectionFrame;

  public MissionSelection(Dimension frameSize) {
	  this.frameSize = frameSize;
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
	  
	  region1Mission1Button = new JButton("Mission 1");
	  region1Title = new JLabel("Region 1");
	  region1Title.setFont(new Font(region1Title.getName(), Font.BOLD, 18));
	  region1Title.setForeground(java.awt.Color.white);
	  region2Mission1Button = new JButton("Mission 1");
	  region2Title = new JLabel("Region 2");
	  region2Title.setFont(new Font(region2Title.getName(), Font.BOLD, 18));
	  region2Title.setForeground(java.awt.Color.white);
	  
	  Dimension maxButtonSize = region1Mission1Button.getPreferredSize();
	  
	  region1Mission1Button.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
			  region1Mission1ButtonPressed(); 
	  		} 
	  } );
	  
	  title = new JLabel("Ship Hub");
	  title.setFont(new Font(title.getName(), Font.BOLD, 25));
	  title.setForeground(java.awt.Color.white);
	  
	  Dimension titleSize = title.getPreferredSize();
	  
	  title.setBounds((int) (frameSize.getWidth() / 2 - titleSize.getWidth() / 2), (int) frameSize.getHeight() / 25,
				(int) titleSize.getWidth(), (int) titleSize.getHeight());
	  
	  region1MissionPanel = new JPanel();
	  region1MissionPanel.setOpaque(false);
	  region1MissionPanel.add(region1Title);
	  region1MissionPanel.add(region1Mission1Button);
	  region1MissionPanel.setBounds((int) (frameSize.getWidth() / 8 - maxButtonSize.getWidth() / 2), (int) (frameSize.getHeight() / 8 - maxButtonSize.getHeight() / 2),
	    		(int) (maxButtonSize.getWidth()), (int) ((maxButtonSize.getHeight())) * 3);
	  
	  region2MissionPanel = new JPanel();
	  region2MissionPanel.setOpaque(false);
	  region2MissionPanel.add(region2Title);
	  region2MissionPanel.add(region2Mission1Button);
	  region2MissionPanel.setBounds((int) (frameSize.getWidth() / 5 - maxButtonSize.getWidth() / 2), (int) (frameSize.getHeight() / 2 - maxButtonSize.getHeight() / 2),
	    		(int) (maxButtonSize.getWidth()), (int) ((maxButtonSize.getHeight())) * 3);
	  
	  missionSelectionFrame.add(region1MissionPanel);
	  missionSelectionFrame.add(region2MissionPanel);
	  missionSelectionFrame.add(title);
	  
	  System.out.println(missionSelectionFrame.getSize().toString());
  }
  
  public void region1Mission1ButtonPressed()
  {
	  missionSelectionFrame.dispose();
	  new MissionSelection(frameSize);
  }

}
