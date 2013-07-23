package edu.wpi.tmathmeyer.chan.model.meta;

public interface MetaFilter {
	public boolean meetsCriteria(Meta<?> m);
}
