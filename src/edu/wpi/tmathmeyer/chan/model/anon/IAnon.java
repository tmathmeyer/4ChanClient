package edu.wpi.tmathmeyer.chan.model.anon;

import java.util.List;

import edu.wpi.tmathmeyer.chan.model.comment.IComment;
import edu.wpi.tmathmeyer.chan.model.image.IImage;
import edu.wpi.tmathmeyer.chan.model.thread.IChanThread;

public interface IAnon {
	public String getID();
	public List<IComment> getCommentsInThread(IChanThread it);
	public List<IComment> getCommentsEverywhere();
	public List<IImage> getImagesInThread(IChanThread it);
	public List<IImage> getAllImages();
}
