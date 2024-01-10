package com.rays.common;

public interface BaseServiceInt <T extends BaseDto>{
	
	public long add(T dto);
	
	public void update(T dto);
	
	public void delete(long id);
	
	public T findById(long pk);

}
