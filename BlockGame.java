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
				
			
			static class MyPanel extends JPanel{ //VANVAS for Draw! 
				public MyPanel() {
					this.setSize(CANVAS_WIDTH, CANVAS_HEIGHT);
					this.setBackground(Color.BLACK);
				}
				@Override
				public void paint(Graphics g) {
					super.paint(g);
					Graphics2D g2d = (Graphics2D)g;
					
					drawUI ( g2d );
				}
				private void drawUI(Graphics2D g2d) {

				
				
					//draw Blocks
					for(int i =0; i<BLOCK_ROWS; i++) {
						for(int j=0; j<BLOCK_COLUMNS; j++) {
							if(blocks[i][j].isHedden) {
								continue;
							}
							
							if(blocks[i][j].color==0) {
								g2d.setColor(Color.WHITE);
							}
							else if(blocks[i][j].color==1) {
								g2d.setColor(Color.YELLOW);
							}
							else if(blocks[i][j].color==2) {
								g2d.setColor(Color.BLUE);
	 					    }
							else if(blocks[i][j].color==3) {
								g2d.setColor(Color.MAGENTA);
							}
							else if(blocks[i][j].color==4) {
								g2d.setColor(Color.RED);
							}
							g2d.fillRect(blocks[i][j].x, blocks[i][j].y, blocks[i][j].width,blocks[i][j].height);//여기까지 블록그리기
							
							
					}
						//draw score
						g2d.setColor(Color.WHITE);
						g2d.setFont(new Font("TimeRoman", Font.BOLD, 20));
						g2d.drawString("score : " + score, CANVAS_WIDTH/2 - 45, 20); //score 위치 30,20 도 괜찮습니다
						
						//draw Ball
						g2d.setColor(Color.YELLOW);
						g2d.fillOval(ball.x, ball.y, BALL_WIDTH, BALL_HEIGHT); 
						
						//draw Bar
						g2d.setColor(Color.PINK);
						g2d.fillOval(bar.x, bar.y, bar.width , bar.height); 
						
						
						
				}
			}
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
				for(int i =0; i<BLOCK_ROWS; i++) {
					for(int j=0; j<BLOCK_COLUMNS; j++) {
						blocks[i][j]= new Block();
						blocks[i][j].x= BLOCK_WIDTH*j + BLOCK_GAP*j;
						blocks[i][j].y= 100+ BLOCK_HEIGHT*i + BLOCK_GAP*i;
						blocks[i][j].width= BLOCK_WIDTH;
						blocks[i][j].height = BLOCK_HEIGHT;
						blocks[i][j].color = 4- i ;
						blocks[i][j].isHedden= false;
						
						
 					}
				}
				
			}
			public void setKeyListener() {
				this.addKeyListener( new KeyAdapter() {
					@Override
					
					public void keyPressed(KeyEvent e ) { //Key Event
						if(e.getKeyCode()== KeyEvent.VK_LEFT) {
							System.out.println("Pressed Left Key");
						}
						else if (e.getKeyCode()== KeyEvent.VK_RIGHT) {
							System.out.println("Pressed Right Key");
							
						}
					}
				});
			}
			public void startTimer() {
				
			}
		
		}

			public static void main(String[] args) {
				new MyFrame("Block Game");
			}
}
