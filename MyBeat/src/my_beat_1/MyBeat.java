package my_beat_1;

import javax.swing.JFrame;

public class MyBeat extends JFrame{ //�׷��ȱ��&jframe�� ���̺귯���� ���
	//ctrl+shift+o = ���̺귯���� class ����

		public MyBeat() {
			setTitle("My Beat");
			setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
			setResizable(false); //�ѹ� ������ ����â�� ����ڰ� ���Ƿ� ���� �Ұ���
			setLocationRelativeTo(null);//����� ����â�� ���߾ӿ� ����ϰ� ��
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//����â�� ���� ���α׷���ü ����
			setVisible(true);//ȭ������� �����ϰ� �� (�⺻���� false)
		}
}
