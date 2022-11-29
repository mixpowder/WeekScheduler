package mixpowder.weekscheduler.listeners;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import mixpowder.weekscheduler.Core;
import mixpowder.weekscheduler.panel.PlanPanel;

public class PlanListener extends MouseAdapter{

	private Core core;

	public PlanListener(Core core){
		this.core = core;
	}

	public void mouseClicked(MouseEvent e) {
		if(e.getClickCount() == 2){
			String val = (String) core.getJList().getSelectedValue(),time = String.valueOf(core.getTimeTableJson().getTime().get(core.getJList().getSelectedIndex())),homework = core.getTimeTableJson().getMemo().get(core.getJList().getSelectedIndex());
			(new PlanPanel(val,time,homework)).setVisible(true);
			System.out.println(val);
		}
	}

}
