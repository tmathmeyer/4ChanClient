package edu.wpi.tmathmeyer.chan.model.thread;

import java.util.LinkedList;
import java.util.List;

import edu.wpi.tmathmeyer.chan.model.comment.ChanComment;
import edu.wpi.tmathmeyer.chan.model.image.ChanImage;
import edu.wpi.tmathmeyer.chan.model.meta.Meta;
import edu.wpi.tmathmeyer.chan.model.meta.MetaFilter;
import edu.wpi.tmathmeyer.chan.model.meta.MetaHolder;

public class ArchivedThread implements ChanThread, MetaHolder{

    private int threadID;
    private boolean stickied, closed;
    private List<ChanComment> comments;
    private List<Meta<?>> metadata;
    
    @Override
    public int getThreadID() {
        return threadID;
    }

    @Override
    public boolean isArchived() {
        return true;
    }

    @Override
    public ChanImage getTitleImage() {
        return this.getTitleComment().getImage();
    }

    @Override
    public ChanComment getTitleComment() {
        return comments.get(0);
    }

    @Override
    public boolean isStickied() {
        return stickied;
    }

    @Override
    public boolean isClosed() {
        return closed;
    }

    @Override
    public List<ChanComment> getAllComments() {
        return comments;
    }

    @Override
    public List<Meta<?>> getMeta() {
        return this.metadata;
    }

    @Override
    public void putMeta(Meta<?> meta) {
        this.metadata.add(meta);
    }

    @Override
    public List<Meta<?>> getMeta(MetaFilter mf) {
        List<Meta<?>> result = new LinkedList<Meta<?>>();
        for(Meta<?> m : this.metadata) {
            if (mf.meetsCriteria(m)) {
                result.add(m);
            }
        }
        return result;
    }

}
