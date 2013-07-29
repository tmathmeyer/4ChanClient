package edu.wpi.tmathmeyer.chan.gui.window.menu;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JPanel;

public class ModernMenu extends JPanel{

	/**
	 * auto-generated default serial ID
	 */
	private static final long serialVersionUID = -4487246198502154655L;
	int width, height;
	
	
	public ModernMenu(int width, int height) {
		this.width = width;
		this.height = height;
		
		this.setPreferredSize(new Dimension(width, height));
		ModernMenuItem icon = new ModernMenuIcon("path_to_chan_icon_later", height);
		ModernMenuItem title = new ModernMenuTitle("ChanChanChanChan", height, width-3*height);
		ModernMenuItem min = new ModernMenuMinimize("path_to_underscore", height);
		ModernMenuItem close = new ModernMenuClose("path_to_x_graphic", height);
		
		this.setLayout(null);
		
		this.add(icon);
		this.add(title);
		this.add(min);
		this.add(close);
		
		icon.setBounds(0, 0, height, height);
		title.setBounds(40, 0, width-3*height, height);
		min.setBounds(width-80, 0, height, height);
		close.setBounds(width-40, 0, height, height);
		
		this.setOpaque(false);
	}
	
	@Override
	public void paintComponent(Graphics g) {
		g.setColor(new Color(0,0,0, 50));
		g.fillRect(0,0,width,height);
	}
}
