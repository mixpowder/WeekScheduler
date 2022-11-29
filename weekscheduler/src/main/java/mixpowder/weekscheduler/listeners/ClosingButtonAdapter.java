package mixpowder.weekscheduler.listeners;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import mixpowder.weekscheduler.Core;

public class ClosingButtonAdapter extends WindowAdapter{

	private Core core;

	public ClosingButtonAdapter(Core core){
		this.core = core;
	}

	public void windowClosing(WindowEvent e) {
		System.out.println("あ");
        this.core.getMainPanel().setVisible(false);
	}
}
