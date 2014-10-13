package org.luckystars.logbackfilter.api;

import java.io.Serializable;

public abstract class LogRecord implements Serializable{

	protected String id;
	protected String eventMsg;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
}
