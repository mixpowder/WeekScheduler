package mixpowder.weekscheduler.listeners;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JList;

import mixpowder.weekscheduler.Core;

public class EditListener extends MouseAdapter{

	private Core core;
	private JList list;

	public EditListener(Core core, JList list){
		this.core = core;
		this.list = list;
	}

	public void mouseClicked(MouseEvent e) {
		if(e.getClickCount() == 2){
			if(this.list.getSelectedValue().equals("追加")){
				System.out.println("追加が押されました");
				this.core.getJList().setListData(new String[] {"aaa","bbb","ccc"});
			}
		}
	}

}
