package mixpowder.weekscheduler.panel;

import java.awt.Color;
import java.io.IOException;

import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.border.LineBorder;

import mixpowder.weekscheduler.Core;
import mixpowder.weekscheduler.Threads.Icon;
import mixpowder.weekscheduler.listeners.ClosingButtonAdapter;
import mixpowder.weekscheduler.listeners.EditListener;
import mixpowder.weekscheduler.listeners.PlanListener;

public class MainPanel extends JDialog {

	private JPanel contentPane;

	public static void main(String[] args) throws IOException{
				Core core = new Core();
				MainPanel frame = new MainPanel(core);
				(new Icon(core)).run();
				frame.setVisible(true);

	}

	public MainPanel(Core core){
		core.setMainPanel(this);
		setTitle("WeekScheduler");
		addWindowListener(new ClosingButtonAdapter(core));
		setBounds(100, 100, 575, 570);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 255, 255));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel label1 = new JLabel("予定");
		label1.setFont(core.getFont());
		label1.setBounds(435, 40, 41, 19);
		contentPane.add(label1);
		JList list = new JList();
		core.setJList(list);
		list.setFont(core.getFont());
		list.setBorder(new LineBorder(new Color(204, 153, 255), 10));
		list.setBackground(new Color(204, 204, 255));
		int size = core.getTimeTableJson().getSize();
		System.out.println(core.getTimeTableJson().toString());
		String[] values = new String[size];
		for(int i = 0; i <size; i++){
			values[i] = core.getTimeTableJson().getClassName().get(i);
		}
		list.setListData(values);
		list.setBounds(335, 65, 208, 439);
		list.addMouseListener(new PlanListener(core));
		contentPane.add(list);

		JList list_1 = new JList();
		list_1.setForeground(new Color(0, 204, 255));
		list_1.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
		list_1.setBackground(new Color(204, 255, 255));
		list_1.setFont(core.getFont());
		list_1.setListData(new String[] {"追加", "削除","書き換え"});
		list_1.addMouseListener(new EditListener(core, list_1));
		list_1.setBounds(17, 199, 169, 142);
		contentPane.add(list_1);
	}
}
