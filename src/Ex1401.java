import javax.swing.*;
import java.awt.*;

public class Ex1401 extends JFrame {
	
	public Ex1401() {
		setTitle("프레임 및 아이콘"); // 프레임 제목 설정
		setSize(600,300);         // 프레임 크기 설정(가로, 세로)
		// setDefaultCloseOperation(JFrane.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		add(panel);
		
		setIconImage(new ImageIcon("Coca-cola-icon.png").getImage());
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true); // 보이기 (이 문은 없으면 못 봐요)
		
	}

	public static void main(String[] args) {
		new Ex1401();

	}

}
