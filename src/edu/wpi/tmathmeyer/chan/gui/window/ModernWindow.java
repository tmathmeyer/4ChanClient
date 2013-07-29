package edu.wpi.tmathmeyer.chan.gui.window;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;

import edu.wpi.tmathmeyer.chan.gui.window.menu.ComponentMover;
import edu.wpi.tmathmeyer.chan.gui.window.menu.ModernMenu;

public class ModernWindow extends JFrame {
	/**
	 * auto-generated default serial ID
	 */
	private static final long serialVersionUID = 4437656742302385336L;
	private ModernMenu windowMenu;
	private ModernBody windowBody;
	
	public ModernWindow(int width, int height) {
		super.setUndecorated(true);
		super.setPreferredSize(new Dimension(width, height));
		
		
		this.setMenu(new ModernMenu(width, 40));
		this.setModernBody(new ModernBody());
		ComponentMover cm = new ComponentMover(ModernWindow.class, this.windowMenu);
		
		super.setBackground(new Color(0, 0, 0, 5));
		super.pack();
		super.setVisible(true);
	}

	/**
	 * @return the menu
	 */
	public ModernMenu getMenu() {
		return windowMenu;
	}

	/**
	 * @param menu the menu to set
	 */
	public void setMenu(ModernMenu menu) {
		this.windowMenu = menu;
		super.add(this.windowMenu, BorderLayout.NORTH);
		super.repaint();
	}
	
	/**
	 * @param body the body to set
	 */
	public void setModernBody(ModernBody body) {
		this.windowBody = body;
		this.add(this.windowBody, BorderLayout.CENTER);
		//super.repaint();
	}
	
	
	
	
	
	
	
	//testing only :D
	public static void main(String[] args) {
		new ModernWindow(1000, 700);
	}
}
