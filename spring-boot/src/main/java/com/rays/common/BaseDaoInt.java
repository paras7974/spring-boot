package com.rays.common;

public interface BaseDaoInt <T extends BaseDto>{
	
	public long add(T dto);
	
	public void update(T dto);
	
	public void delete(T dto);
	
	public T finByPk(long pk);

}
