package mixpowder.weekscheduler.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mixpowder.weekscheduler.Core;

public class PanelShowListener implements ActionListener{

	private Core core;

	public PanelShowListener(Core core){
		this.core = core;
	}

	public void actionPerformed(ActionEvent e) {
		this.core.getMainPanel().setVisible(true);
	}

}
