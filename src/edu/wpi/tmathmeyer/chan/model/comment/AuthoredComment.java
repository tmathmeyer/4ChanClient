/*******************************************************************************
 * author: Ted Meyer
 * since: july, 2013
 *******************************************************************************/
package edu.wpi.tmathmeyer.chan.model.comment;

import java.util.LinkedList;
import java.util.List;

import edu.wpi.tmathmeyer.chan.model.image.ChanImage;
import edu.wpi.tmathmeyer.chan.model.meta.Meta;
import edu.wpi.tmathmeyer.chan.model.meta.MetaFilter;
import edu.wpi.tmathmeyer.chan.model.thread.ChanThread;

public class AuthoredComment implements ChanComment{

    private ChanImage image;
    private String postContent;
    private List<ChanComment> replies;
    private List<ChanComment> inReplyTo;
    private Meta<String> author;
    private ChanThread containerThread;
    
    @Override
    public ChanImage getImage() {
        return this.image;
    }

    @Override
    public String getPostContent() {
        return this.postContent;
    }

    @Override
    public List<ChanComment> getRepiles() {
        return this.replies;
    }

    @Override
    public List<ChanComment> getInReplyTo() {
        return this.inReplyTo;
    }
    
    public Meta<String> getAuthor() {
        return this.author;
    }
    
    public List<ChanComment> getAuthorsComments() {
        List<ChanComment> allComments = this.containerThread.getAllComments();
        List<ChanComment> result = new LinkedList<ChanComment>();
        for(ChanComment c : allComments) {
            if (c instanceof AuthoredComment) {
                if (((AuthoredComment)c).getAuthor().getMetaData().equals(this.getAuthor().getMetaData())) {
                    result.add(c);
                }
            }
        }
        return result;
    }

    @Override
    public List<Meta<?>> getMeta() {
        List<Meta<?>> meta = new LinkedList<Meta<?>>();
        meta.add(this.getAuthor());
        return meta;
    }

    @Override
    public void putMeta(Meta<?> meta) {
        return;
    }

    @Override
    public List<Meta<?>> getMeta(MetaFilter mf) {
        List<Meta<?>> result = new LinkedList<Meta<?>>();
        List<Meta<?>> meta = this.getMeta();
        for(Meta<?> m : meta) {
            if (mf.meetsCriteria(m)) {
                result.add(m);
            }
        }
        return result;
    }

}
