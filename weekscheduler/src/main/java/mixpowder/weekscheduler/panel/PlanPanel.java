package mixpowder.weekscheduler.panel;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class PlanPanel extends JFrame {

	public PlanPanel(String name, String time, String homework) {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 250, 334);
		JPanel contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton button = new JButton("閉じる");
		button.setBounds(89, 202, 73, 27);
		contentPane.add(button);

		JLabel lblNewLabel = new JLabel(name);
		lblNewLabel.setBounds(89, 15, 73, 19);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel(time);
		lblNewLabel_1.setBounds(89, 65, 73, 19);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel(homework);
		lblNewLabel_2.setBounds(89, 118, 73, 19);
		contentPane.add(lblNewLabel_2);
	}
}
