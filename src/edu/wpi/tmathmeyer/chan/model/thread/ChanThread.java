package edu.wpi.tmathmeyer.chan.model.thread;

import java.util.List;

import edu.wpi.tmathmeyer.chan.model.comment.ChanComment;
import edu.wpi.tmathmeyer.chan.model.image.ChanImage;

public interface ChanThread {
    
    /**
     * 
     * @return the ID of this thread
     */
    public int getThreadID();
    
    /**
     * 
     * @return whether the thread is archived on the user's computer
     */
    public boolean isArchived();
    
    /**
     * 
     * @return the title image of this comment
     */
    public ChanImage getTitleImage();
    
    /**
     * 
     * @return the title comment of this image
     */
    public ChanComment getTitleComment();
    
    /**
     * 
     * @return whether the thread is (or was) stickied on the board from which it is being hosted
     */
    public boolean isStickied();
    
    /**
     * 
     * @return whether the thread was closed for posting before it 404'd
     */
    public boolean isClosed();
    
    /**
     * 
     * @return all of the comments on this thread
     */
    public List<ChanComment> getAllComments();
}
