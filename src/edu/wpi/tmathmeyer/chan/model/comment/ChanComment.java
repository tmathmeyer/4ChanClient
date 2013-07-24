package edu.wpi.tmathmeyer.chan.model.comment;

import java.util.List;

import edu.wpi.tmathmeyer.chan.model.image.ChanImage;
import edu.wpi.tmathmeyer.chan.model.meta.MetaHolder;

public interface ChanComment extends MetaHolder{
    
    /**
     * 
     * @return the image which was uploaded with this comment
     */
    public ChanImage getImage();
    
    /**
     * 
     * @return the text content of this post as a string
     */
    public String getPostContent();
    
    /**
     * 
     * @return get the replies to this comment
     */
    public List<ChanComment> getRepiles();
    
    /**
     * 
     * @return the comments linked to in this thread
     */
    public List<ChanComment> getInReplyTo();
}
