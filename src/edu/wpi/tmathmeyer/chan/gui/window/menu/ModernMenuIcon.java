package edu.wpi.tmathmeyer.chan.gui.window.menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

public class ModernMenuIcon extends ModernMenuItem{
	
	private static final long serialVersionUID = 4117974614920861209L;
	int height;
	
	public ModernMenuIcon(String iconPath, int height) {
		this.height = height;
		this.setPreferredSize(new Dimension(height, height));
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(Color.GREEN);
		g.fillRect(0, 0, height, height);
	}
}
