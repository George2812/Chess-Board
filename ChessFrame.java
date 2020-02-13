import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ChessFrame extends JFrame{

	private BoardPanel panel;
	
	public ChessFrame() {
		
		panel=new BoardPanel();
		this.setContentPane(panel);
		MouseClickListener listener=new MouseClickListener();
		panel.addMouseListener(listener);
		
		this.setVisible(true);
		this.setSize(400, 400);
		this.setTitle("Chess Board");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	class BoardPanel extends JPanel{
		
		private static final int ROWS=8;
		private static final int COLUMNS=8;
		private int xCoord=50;
		private int yCoord=50;
		
		
		public void setXCoord(int x) {
			xCoord=x;
			
		}
		
		public void setYCoord(int y) {
			yCoord=y;
		}
		
		
		public void paintComponent(Graphics g) {
			
			int sqSize=this.getHeight()/ROWS;
			
			
			for(int i=0;i<ROWS;i++) {
				
				for(int j=0;j<COLUMNS;j++) {
					
					int x=j*sqSize;
					int y=i*sqSize;
					g.setColor(Color.CYAN);
					g.fillRect(x, y, sqSize, sqSize);
					g.setColor(Color.orange);
					if((i+j)%2==0)
						g.fillRect(x, y, sqSize, sqSize);
				}
			}
			
			g.setColor(Color.RED);
			g.fillOval(xCoord, yCoord, 40, 40);
			
		}
		
	}
	class MouseClickListener implements MouseListener{
		
		public void mouseClicked(MouseEvent e) {
			
			int x=e.getX();
			int y=e.getY();
			panel.setXCoord(x-20);
			panel.setYCoord(y-20);
			panel.repaint();
			
		}
		
		public void mousePressed(MouseEvent e) { }
		
		public void mouseReleased(MouseEvent e) { }
		
		public void mouseEntered(MouseEvent e) { }
		
		public void mouseExited(MouseEvent e) { }

		

		
		
	}
}
