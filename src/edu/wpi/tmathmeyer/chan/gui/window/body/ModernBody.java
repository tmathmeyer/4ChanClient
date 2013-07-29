package edu.wpi.tmathmeyer.chan.gui.window.body;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ModernBody extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8270837007917055251L;

	public ModernBody() {
		super();
		System.out.println("lele");
		//this.setOpaque(true);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(new Color(0,0,0));
		g.fillRect(0,0,1000,1000);
	}
}
