package my_beat_1;



import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyBeat extends JFrame{ //그래픽기반&jframe을 라이브러리에 등록
	//ctrl+shift+o = 라이브러리로 class 저장
	private Image screenImage;
	private Graphics screenGrapghic; //2가지는 더블버퍼링을 위해서 전체화면에 대한 이미지
	
	private Image introBackground; //인트로 백그라운드로 갈 수 있게
		
	
		public MyBeat() {
			setTitle("My Beat");
			setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
			setResizable(false); //한번 지정된 게임창은 사용자가 임의로 수정 불가능
			setLocationRelativeTo(null);//실행시 게임창이 정중앙에 출력하게 함
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//게임창을 끄고 프로그램전체 종료
			setVisible(true);//화면출력을 가능하게 함 (기본값이 false)
			
			
			introBackground = new ImageIcon(Main.class.getResource("./images.intro.jpg")).getImage();
		}
		
		public void paint(Graphics g) {
			screenImage = createImage(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
			Graphics screenGraphic = screenImage.getGraphics();
			screenDraw(screenGraphic);
			g.drawImage(screenImage, 0, 0, null);
		}
		
	
		
		private void screenDraw(Graphics screenGraphic) {
			// TODO Auto-generated method stub
			
		}

		public void scteenDraw(Graphics g) {
			g.drawImage(introBackground, 0, 0 , null);
			this.repaint();
		}
		
}
