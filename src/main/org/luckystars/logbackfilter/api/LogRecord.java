package org.luckystars.logbackfilter.api;

import java.io.Serializable;
import java.util.Date;

@SuppressWarnings("serial")
public class LogRecord implements Serializable{

	protected String id;
	protected String eventMsg;
	protected String url;
	protected String person;
	protected Date time;
	
	///////////////////////
	////GETTERS&SETTERS////
	///////////////////////
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEventMsg() {
		return eventMsg;
	}
	public void setEventMsg(String eventMsg) {
		this.eventMsg = eventMsg;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
	
	
}
