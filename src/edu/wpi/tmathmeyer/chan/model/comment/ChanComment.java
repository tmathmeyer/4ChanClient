package edu.wpi.tmathmeyer.chan.model.comment;

import edu.wpi.tmathmeyer.chan.model.image.ChanImage;

public interface ChanComment {
	
	/**
	 * 
	 * @return the image which was uploaded with this comment
	 */
	public ChanImage getImage();
}
