package edu.wpi.tmathmeyer.chan.model.image;

import edu.wpi.tmathmeyer.chan.model.meta.Meta;

public class ImageMeta<E> implements Meta<E> {

	E value;
	
	@Override
	public E getMetaData() {
		return value;
	}
	
	public ImageMeta(E e){
		this.value = e;
	}

}
