package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Classes 
{
	@Id
	private int no;
	private int cid;
	
	public int getNo() 
	{
		return no;
	}
	public void setNo(int no) 
	{
		this.no = no;
	}
	public int getCid() 
	{
		return cid;
	}
	public void setCid(int cid) 
	{
		this.cid = cid;
	}
	@Override
	public String toString() 
	{
		return "Classes [no=" + no + ", cid=" + cid + "]";
	}
	

	
}
