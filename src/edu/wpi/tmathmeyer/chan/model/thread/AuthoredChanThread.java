package edu.wpi.tmathmeyer.chan.model.thread;

import edu.wpi.tmathmeyer.chan.model.anon.IAnon;
import edu.wpi.tmathmeyer.chan.model.comment.IComment;
import edu.wpi.tmathmeyer.chan.model.image.IImage;

public class AuthoredChanThread implements IChanThread{

	private IComment titleComment;
	
	@Override
	public IAnon getOP() {
		return titleComment.getPoster();
	}

	@Override
	public IImage getTitleImage() {
		return titleComment.getImage();
	}

	@Override
	public String getDescription() {
		return titleComment.getContent();
	}

	@Override
	public int getThreadNumber() {
		return titleComment.getID();
	}

	@Override
	public String getThreadPostTime() {
		return titleComment.getTimeStamp();
	}

}
