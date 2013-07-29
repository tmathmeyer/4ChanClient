package edu.wpi.tmathmeyer.chan.gui.window.menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class ModernMenuClose extends ModernMenuItem{
	
	private static final long serialVersionUID = 4239360744117400584L;
	String icon;
	int height;
	
	public ModernMenuClose(String icon, int height) {
		this.icon = icon;
		this.height = height;
		this.setPreferredSize(new Dimension(height, height));
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.red);
		g.fillRect(0, 0, height, height);
	}
}
