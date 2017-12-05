import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
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

public class GameLaunch {

	private static JButton exitGameButton;
	private static JButton newGameButton;
	private static JButton loadGameButton;
	private static JFrame launchFrame;
	private static Dimension frameSize;
	
	public static void main(String[] args) {
		
		launchFrame = new JFrame("<Group5> Main Menu");
		launchFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		 
		try {
			launchFrame.setContentPane(new JLabel((Icon) new ImageIcon(ImageIO.read(new File("maxresdefault.jpg")))));
	     	} catch (IOException e) {
	    		e.printStackTrace();
	     	}
		 
		launchFrame.pack();
		frameSize = launchFrame.getPreferredSize();
		
		JLabel title = new JLabel("<Group 5>");
		title.setFont(new Font(title.getName(), Font.BOLD, 100));
		title.setForeground(java.awt.Color.white);
		 
		Dimension titleSize = title.getPreferredSize();
		 
		title.setBounds((int) (frameSize.getWidth() / 2 - titleSize.getWidth() / 2), (int) frameSize.getHeight() / 10,
			(int) titleSize.getWidth(), (int) titleSize.getHeight());
		 
	    newGameButton = new JButton("New Game");
	    newGameButton.addActionListener(new ActionListener() {
			  public void actionPerformed(ActionEvent e) {
			  		newGameButtonPressed(); 
			  } 
		} );
	    
	    loadGameButton = new JButton("Load Game");
	     
		exitGameButton = new JButton("Exit Game");
		exitGameButton.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		} );
		 
		Dimension maxButtonSize = loadGameButton.getPreferredSize();
		newGameButton.setPreferredSize(maxButtonSize);
		exitGameButton.setPreferredSize(maxButtonSize);
		 
		JPanel launchPanel = new JPanel();
		launchPanel.setOpaque(false);
		launchPanel.add(newGameButton);
		launchPanel.add(loadGameButton);
		launchPanel.add(exitGameButton);

	    launchPanel.setBounds((int) (frameSize.getWidth() / 2 - maxButtonSize.getWidth() / 2), (int) (frameSize.getHeight() / 2 - maxButtonSize.getHeight() / 2),
	    		(int) (maxButtonSize.getWidth()), (int) ((maxButtonSize.getHeight())) * 4);
	     
	    launchFrame.add(launchPanel);
	    launchFrame.add(title);
	    launchFrame.setVisible(true);
	}
	
	public static void newGameButtonPressed()
	{
		  launchFrame.dispose();
		  new PlayerSelection(frameSize);
	}
	
}
