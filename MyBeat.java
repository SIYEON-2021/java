package my_beat_1;



import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class MyBeat extends JFrame{ //�׷��ȱ��&jframe�� ���̺귯���� ���
	//ctrl+shift+o = ���̺귯���� class ����
	private Image screenImage;
	private Graphics screenGrapghic; //2������ ������۸��� ���ؼ� ��üȭ�鿡 ���� �̹���
	
	private Image introBackground; //��Ʈ�� ��׶���� �� �� �ְ�
		
	
		public MyBeat() {
			setTitle("My Beat");
			setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
			setResizable(false); //�ѹ� ������ ����â�� ����ڰ� ���Ƿ� ���� �Ұ���
			setLocationRelativeTo(null);//����� ����â�� ���߾ӿ� ����ϰ� ��
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//����â�� ���� ���α׷���ü ����
			setVisible(true);//ȭ������� �����ϰ� �� (�⺻���� false)
			
			
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
