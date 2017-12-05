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
  
  private static JButton mission1Button;
  
  private JPanel missionPanel;
  
  private JLabel title;
  
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
	  
	  mission1Button = new JButton("Mission 1");
	  
	  Dimension maxButtonSize = mission1Button.getPreferredSize();
	  
	  mission1Button.addActionListener(new ActionListener() {
		  public void actionPerformed(ActionEvent e) {
	  		mission1ButtonPressed(); 
	  		} 
	  } );
	  
	  title = new JLabel("Ship Hub");
	  title.setFont(new Font(title.getName(), Font.BOLD, 25));
	  title.setForeground(java.awt.Color.white);
	  
	  Dimension titleSize = title.getPreferredSize();
	  
	  title.setBounds((int) (frameSize.getWidth() / 2 - titleSize.getWidth() / 2), (int) frameSize.getHeight() / 25,
				(int) titleSize.getWidth(), (int) titleSize.getHeight());
	  
	  missionPanel = new JPanel();
	  missionPanel.setOpaque(false);
	  missionPanel.add(mission1Button);
	  missionPanel.setBounds((int) (frameSize.getWidth() / 2 - maxButtonSize.getWidth() / 2), (int) (frameSize.getHeight() / 2 - maxButtonSize.getHeight() / 2),
	    		(int) (maxButtonSize.getWidth()), (int) ((maxButtonSize.getHeight())) * 3);
	  
	  missionSelectionFrame.add(missionPanel);
	  missionSelectionFrame.add(title);
	  
	  System.out.println(missionSelectionFrame.getSize().toString());
  }
  
  public void mission1ButtonPressed()
  {
	  missionSelectionFrame.dispose();
	  new MissionSelection(frameSize);
  }

}
