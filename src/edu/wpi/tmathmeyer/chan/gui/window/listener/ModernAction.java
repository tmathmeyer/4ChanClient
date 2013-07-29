package edu.wpi.tmathmeyer.chan.gui.window.listener;

public class ModernAction {
	private ModernActable source;
	public ModernAction(ModernActable source) {
		this.source = source;
	}
	
	public ModernActable getSource() {
		return source;
	}
}
