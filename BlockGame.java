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
			static MyPanel myPanel = null;
			static int score = 0;
			static Timer time = null;
			static Block[][] blocks = new Block [BLOCK_ROWS][BLOCK_COLUMNS]; //세로 가로 y x
			static Bar bar= new Bar();
			static Ball ball = new Ball(); 
			static int barXTarget = bar.x; // Target Value - interpolation
			static int dir = 0; // 0 ; Up-Right 1 : Down-Right 2: Up-Left 3: Down-Left
			static int ballSpeed = 5;
			
			
			
			
			static class Ball {
				int x = CANVAS_WIDTH/ 2 - BALL_WIDTH/2;
				int y= CANVAS_HEIGHT/ 2 - BALL_HEIGHT / 2;;
				int width = BALL_WIDTH;
				int height = BALL_HEIGHT;
				
			}
			
			static class Bar {
				int x= CANVAS_WIDTH / 2 - BAR_WIDTH/2;
				int y= CANVAS_HEIGHT - 100;
				int width = BAR_WIDTH;
				int height=  BAR_HEIGHT;
				
			}
			
			static class Block{
				int x=0 ;
				int y=0 ;
				int width =BLOCK_WIDTH;
				int height = BLOCK_HEIGHT;
				int color = 0; //0:white 1:yellow 2:blue 2:mazanta 4:red
				boolean isHedden = false; // after collison, block will be hidden.
			}
				
			
			static class MyPanel extends JPanel{
				
				
			}
			
		

			public MyFrame(String title) {
				super(title);
				this.setVisible(true);
				this.setSize(CANVAS_WIDTH, CANVAS_HEIGHT);
				this.setLocation(400,300);
				this.setLayout(new BorderLayout());
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				initData();
				
				myPanel = new MyPanel();
				this.add( "Center", myPanel);
				setKeyListener();
				startTimer();
			}
			public void initData() {
				
			}
			public void setKeyListener() {
				
			}
			public void startTimer() {
				
			}
		
		}

			public static void main(String[] args) {
				new MyFrame("Block Game");
			}
}
