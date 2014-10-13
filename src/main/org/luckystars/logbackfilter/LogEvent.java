package org.luckystars.logbackfilter;

import java.io.Serializable;

public class LogEvent implements Serializable{

	private String name;
	private String id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
