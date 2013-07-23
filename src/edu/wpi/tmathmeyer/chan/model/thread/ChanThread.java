package edu.wpi.tmathmeyer.chan.model.thread;

import java.util.List;

import edu.wpi.tmathmeyer.chan.model.comment.ChanComment;
import edu.wpi.tmathmeyer.chan.model.image.ChanImage;

public class ChanThread {
	
	private List<ChanComment> comments;
	private boolean stickied;
	private boolean closed;
	
	public ChanImage getTitleImage() {
		return this.getTitleComment().getImage();
	}
	
	public ChanComment getTitleComment() {
		return comments.get(0);
	}
	
	public boolean isStickied(){
		return this.stickied;
	}
	
	public boolean isClosed() {
		return this.closed;
	}
	
	public List<ChanComment> getAllComments() {
		return comments;
	}
}
