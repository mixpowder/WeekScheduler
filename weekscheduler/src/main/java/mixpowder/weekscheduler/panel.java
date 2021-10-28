package mixpowder.weekscheduler;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class panel extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					panel frame = new panel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public panel() {
		setTitle("WeekScheduler");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 575, 570);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label1 = new JLabel("予定");
		label1.setFont(new Font("游明朝", Font.PLAIN, 18));
		label1.setBounds(435, 40, 41, 19);
		contentPane.add(label1);
		JList list = new JList();
		list.setFont(new Font("游明朝", Font.PLAIN, 18));
		list.setBorder(new LineBorder(new Color(204, 153, 255), 10));
		list.setBackground(new Color(204, 204, 255));
		String[] values = new String[] {"a", "v", "b", "f"};
		list.setListData(values);
		list.setBounds(374, 65, 169, 439);
		contentPane.add(list);
	}
}
