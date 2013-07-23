package edu.wpi.tmathmeyer.chan.model.image;

import edu.wpi.tmathmeyer.chan.model.anon.IAnon;
import edu.wpi.tmathmeyer.chan.model.comment.IComment;

public interface IImage {
	public String getImageName();
	public byte[] getImageData();
	public IComment getComment();
	public IAnon getPoster();
}
