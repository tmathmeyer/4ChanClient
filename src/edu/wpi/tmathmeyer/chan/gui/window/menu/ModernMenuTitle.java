package edu.wpi.tmathmeyer.chan.gui.window.menu;

import java.awt.Color;
import java.awt.Graphics;

public class ModernMenuTitle extends ModernMenuItem{
	
	private static final long serialVersionUID = 4239360744117400584L;
	String title;
	
	public ModernMenuTitle(String title, int height, int width) {
		this.title = title;
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.white);
		g.drawString(title, 15, 25);
	}
}