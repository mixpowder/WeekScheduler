package mixpowder.weekscheduler.Threads;

import java.awt.AWTException;
import java.awt.Image;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.SystemTray;
import java.awt.Toolkit;
import java.awt.TrayIcon;

import mixpowder.weekscheduler.Core;
import mixpowder.weekscheduler.listeners.PanelExitListener;
import mixpowder.weekscheduler.listeners.PanelShowListener;

public class Icon {

	private Core core;

	public Icon(Core core){
		this.core = core;
	}

	  public void run() {
			Image image = Toolkit.getDefaultToolkit().createImage("http://t3.gstatic.com/licensed-image?q=tbn:ANd9GcSUen8OvOC7avpHPnxVbOAcin3hqm1rCNdhTV0oqMOIYWs7wNjnBq6T4bmwFlEmC1ZEhTm6YdmbtuBzuxilrdQ");
			PopupMenu popup = new PopupMenu();
			TrayIcon icon = new TrayIcon(image, "WeekScheduler",popup);
			icon.setImageAutoSize(true);
			MenuItem item1 = new MenuItem("表示");
			item1.setFont(this.core.getFont());
			item1.addActionListener(new PanelShowListener(this.core));
			MenuItem item2 = new MenuItem("終了");
			item2.setFont(this.core.getFont());
			item2.addActionListener(new PanelExitListener(this.core));
			popup.add(item1);
			popup.add(item2);
			try {
				SystemTray.getSystemTray().add(icon);
			} catch (AWTException e1) {
	        	e1.printStackTrace();
			}
	  }

}
