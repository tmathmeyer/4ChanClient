package edu.wpi.tmathmeyer.chan.model.comment;

import java.util.List;

import edu.wpi.tmathmeyer.chan.model.anon.IAnon;
import edu.wpi.tmathmeyer.chan.model.image.IImage;

public interface IComment {
	public IAnon getPoster();
	public IImage getImage();
	public List<IComment> getReplies();
	public List<IComment> getCommentsInReplyTo();
	public String getTimeStamp();
	public boolean hasImage();
	public String getContent();
	public int getID();
}
