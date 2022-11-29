package mixpowder.weekscheduler.listeners;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import mixpowder.weekscheduler.Core;

public class PanelExitListener implements ActionListener{

	private Core core;

	public PanelExitListener(Core core){
		this.core = core;
	}

	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}

}
