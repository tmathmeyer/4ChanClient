package edu.wpi.tmathmeyer.chan.model.image;

import java.util.LinkedList;
import java.util.List;

import edu.wpi.tmathmeyer.chan.model.meta.Meta;
import edu.wpi.tmathmeyer.chan.model.meta.MetaFilter;
import edu.wpi.tmathmeyer.chan.model.meta.MetaHolder;

public class ChanImage implements MetaHolder{

	private List<Meta<?>> meta = new LinkedList<Meta<?>>();
	Meta<String> name;
	private byte[] data;
	
	public ChanImage(byte[] data, String name) {
		this.setData(data);
		this.name = new ImageMeta<String>(name);
		this.meta.add(this.name);
	}
	
	@Override
	public List<Meta<?>> getMeta() {
		return this.meta;
	}

	@Override
	public void putMeta(Meta<?> meta) {
		this.meta.add(meta);
	}

	@Override
	public List<Meta<?>> getMeta(MetaFilter mf) {
		List<Meta<?>> result = new LinkedList<Meta<?>>();
		for(Meta<?> m : this.meta) {
			if (mf.meetsCriteria(m)) {
				result.add(m);
			}
		}
		return result;
	}

	/**
	 * @return the image byte data
	 */
	public byte[] getData() {
		return data;
	}

	/**
	 * @param data the image byte data to set
	 */
	public void setData(byte[] data) {
		this.data = data;
	}

}
