/*******************************************************************************
 * author: Ted Meyer
 * since: july, 2013
 *******************************************************************************/
package edu.wpi.tmathmeyer.chan.model.thread;

import java.util.List;

import edu.wpi.tmathmeyer.chan.model.comment.ChanComment;
import edu.wpi.tmathmeyer.chan.model.image.ChanImage;

public class LiveThread implements ChanThread{
    
    private List<ChanComment> comments;
    private boolean stickied;
    private boolean closed;
    private int ID;
    
    @Override
    public ChanImage getTitleImage() {
        return this.getTitleComment().getImage();
    }
    
    @Override
    public ChanComment getTitleComment() {
        return comments.get(0);
    }
    
    @Override
    public boolean isStickied(){
        return this.stickied;
    }

    @Override
    public boolean isClosed() {
        return this.closed;
    }
    
    @Override
    public List<ChanComment> getAllComments() {
        return comments;
    }

    @Override
    public int getThreadID() {
        return ID;
    }

    @Override
    public boolean isArchived() {
        return false;
    }
}
