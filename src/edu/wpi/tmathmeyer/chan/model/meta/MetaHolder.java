package edu.wpi.tmathmeyer.chan.model.meta;

import java.util.List;

public interface MetaHolder {
    public List<Meta<?>> getMeta();
    public void putMeta(Meta<?> meta);
    public List<Meta<?>> getMeta(MetaFilter mf);
}
