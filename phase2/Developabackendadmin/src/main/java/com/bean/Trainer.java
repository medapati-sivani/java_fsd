package com.bean;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
@Entity
public class Trainer 
{
	@Id
	private int tid;
	private String tname;
	
	@OneToMany
	@JoinColumn(name="tsid")
	private List<Students> listofstd;
	
	@OneToMany
	@JoinColumn(name="tsubid")
	private List<Subjects> listofsub;

	public int getTid() 
	{
		return tid;
	}

	public void setTid(int tid) 
	{
		this.tid = tid;
	}

	public String getTname() 
	{
		return tname;
	}

	public void setTname(String tname)
	{
		this.tname = tname;
	}

	public List<Students> getListofstd() 
	{
		return listofstd;
	}

	public void setListofstd(List<Students> listofstd) 
	{
		this.listofstd = listofstd;
	}

	public List<Subjects> getListofsub() 
	{
		return listofsub;
	}

	public void setListofsub(List<Subjects> listofsub) 
	{
		this.listofsub = listofsub;
	}

	@Override
	public String toString() 
	{
		return "Trainer [tid=" + tid + ", tname=" + tname + ", listofstd=" + listofstd + ", listofsub=" + listofsub
				+ "]";
	}
}