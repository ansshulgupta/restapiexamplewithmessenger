package com.demo.MessangerApp;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Alian {

	private int alianId;
	private String alianName;
	private int alianPoint;
	
	
	public Alian()
	{
		
	}
		
	public int getAlianId() {
		return alianId;
	}
	public void setAlianId(int alianId) {
		this.alianId = alianId;
	}
	public String getAlianName() {
		return alianName;
	}
	public void setAlianName(String alianName) {
		this.alianName = alianName;
	}
	public int getAlianPoint() {
		return alianPoint;
	}
	public void setAlianPoint(int alianPoint) {
		this.alianPoint = alianPoint;
	}
	
}
