import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class BlockGame {
	
	static class MyFrame extends JFrame{
		
		//constant 
		static int BALL_WIDTH= 20;
		static int BALL_HEIGHT = 20;
		static int BLOCK_ROWS = 5; //줄 수
		static int BLOCK_COLUMNS= 10;
		static int BLOCK_WIDTH= 40;
		static int BLOCK_HEIGHT= 20;
		static int BLOCK_GAP = 3;
		static int BAR_WIDTH = 80;
		static int BAR_HEIGHT = 20;
		static int CANVAS_WIDTH= 400 + (BLOCK_GAP*BLOCK_COLUMNS)-BLOCK_COLUMNS;
		static int CANVAS_HEIGHT= 600;
		
		//variable
		public MyFrame(String title) {
			super(title);
			static MyPanel = null;
			static int score = 0;
			static Timer time = null;
			static BLOCK[][] blocks = new Block [BLOCK_ROWS][BLOCK_COLUMNS]; //세로 가로 y x
			
			static Bar bar = new Bar();
			
			static class Ball {
				
			}
			
			static class Bar {
				
			}
			
			static class Block{
				
			}
			
			static class MyPanel extends JPanel{
				
			}
			
		}
	}

	public static void main(String[] args) {
		
		new MyFrame("Block Game");
		
			
	}

}
