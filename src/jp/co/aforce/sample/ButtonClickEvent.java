package jp.co.aforce.sample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ButtonClickEvent {

	public static void main(String[] args) {
		//問２
		JButton button = new JButton("クリック");
		ActionListener btn = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("ボタンがクリックされた！");
			}
		};
		button.addActionListener(btn);

		//ここからJFrame
		// ① ウィンドウを作る
		JFrame frame = new JFrame("サンプル");

		// ② ボタンをウィンドウに追加
		frame.add(button);

		// ③ ウィンドウ設定
		frame.setSize(300, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// ④ 表示！
		frame.setVisible(true);
	}

}
