/*******************************************************************************
 * author: Ted Meyer
 * since: july, 2013
 *******************************************************************************/
package edu.wpi.tmathmeyer.chan.model.meta;

public interface MetaFilter {
    public boolean meetsCriteria(Meta<?> m);
}
