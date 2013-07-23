package edu.wpi.tmathmeyer.chan.model.thread;

import edu.wpi.tmathmeyer.chan.model.anon.IAnon;
import edu.wpi.tmathmeyer.chan.model.image.IImage;

public interface IChanThread {
	public IAnon getOP();
	public IImage getTitleImage();
	public String getDescription();
	public int getThreadNumber();
	public String getThreadPostTime();
}
