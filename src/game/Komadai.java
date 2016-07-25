package game;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

// 駒台（取った駒を置くための台）
public class Komadai {

	private static final int SIZE = Board.SIZE;
	public static JButton[] komadai = new JButton[2*SIZE];
	private JPanel panel = new JPanel();

	public Komadai() {
		super();
		// ラベルの初期化
		for (int i = 0; i < komadai.length; i++) {
			komadai[i] = new JButton();
			komadai[i].setName(String.valueOf(i));
		}

		// パネルの配置
		panel.setBackground(Color.BLACK);
		GridLayout layout = new GridLayout(2, SIZE);
		layout.setHgap(5);
		layout.setVgap(5);
		panel.setLayout(layout);

		for (int i = 0; i < 18; i++) {
			komadai[i].setBackground(Color.ORANGE);
			komadai[i].setOpaque(true);
			komadai[i].setText("　");
			panel.add(komadai[i]);
		}
	}

	public JPanel getPanel(){
		return panel;
	}
}