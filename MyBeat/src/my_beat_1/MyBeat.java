package my_beat_1;

import javax.swing.JFrame;

public class MyBeat extends JFrame{ //그래픽기반&jframe을 라이브러리에 등록
	//ctrl+shift+o = 라이브러리로 class 저장

		public MyBeat() {
			setTitle("My Beat");
			setSize(Main.SCREEN_WIDTH, Main.SCREEN_HEIGHT);
			setResizable(false); //한번 지정된 게임창은 사용자가 임의로 수정 불가능
			setLocationRelativeTo(null);//실행시 게임창이 정중앙에 출력하게 함
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//게임창을 끄고 프로그램전체 종료
			setVisible(true);//화면출력을 가능하게 함 (기본값이 false)
		}
}
