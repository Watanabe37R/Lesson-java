package jp.co.aforce.sample;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

public class OneSecondTimer {

	public static void main(String[] args) {
		//問３
		ActionListener oneSecond = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Tick");
			}
		};
		Timer time = new Timer(1_000, oneSecond);

		/*Timer time = new Timer(1_000, new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Tick");
			}
		});*/

		time.start();
		
		//JFrameの設定、これが出ている間はカウントをする
        JFrame frame = new JFrame();
        frame.setSize(200, 100);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

	}

}
