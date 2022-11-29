package mixpowder.weekscheduler;

import java.awt.Font;

import javax.swing.JList;

import mixpowder.weekscheduler.panel.MainPanel;

public class Core {

	public JList jlist;
	public Font font = new Font("明朝体", Font.PLAIN, 18);
	public MainPanel panel;

	public void setMainPanel(MainPanel panel) {
		this.panel = panel;
	}

	public Font getFont(){
		return font;
	}

	public MainPanel getMainPanel(){
		return panel;
	}

	public void setJList(JList list){
		this.jlist = list;
	}

	public JList getJList(){
		return this.jlist;
	}

	public TimeTableJson getTimeTableJson(){
		return new TimeTableJson();
	}

}