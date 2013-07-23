package edu.wpi.tmathmeyer.chan.model.board;

import java.util.List;

import edu.wpi.tmathmeyer.chan.model.thread.ChanThread;

public class ChanBoard {
	
	public enum BoardName {
		RANDOM("b"), ANIME("a"), WALLPAPER_GENERAL("wg");
		
		private final String shortName;
		BoardName(String sn) {
			this.shortName = sn;
		}
	}
	
	
	private BoardName name;
	private List<ChanThread> threads;
}
