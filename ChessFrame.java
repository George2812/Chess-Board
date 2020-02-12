import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChessFrame extends JFrame{

	private BoardPanel panel;
	
	public ChessFrame() {
		
		panel=new BoardPanel();
		this.setContentPane(panel);
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("Chess Board");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class BoardPanel extends JPanel{
		
		private static final int ROWS=8;
		private static final int COLUMNS=8;
		
		public void paintComponent(Graphics g) {
			
			int sqSize=20;
			
			for(int i=0;i<ROWS;i++) {
				
				for(int j=0;j<COLUMNS;j++) {
					
					int x=j*sqSize;
					int y=i*sqSize;
					
					g.drawRect(x, y, sqSize, sqSize);
				}
			}
			
		}
		
	}
}
