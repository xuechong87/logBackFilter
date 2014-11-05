package org.luckystars.logbackfilter;

import org.luckystars.logbackfilter.api.LogRecord;

import akka.actor.ActorSystem;
import akka.actor.Inbox;

public class LogProcessor {
	
	private static final String DEFAULT_SYSTEM_NAME = "LOGGER_ACTOR_SYSTEM";
	
	private final ActorSystem actorSystem;
	private final Inbox inbox;
	
	private LogProcessor(){
		this(DEFAULT_SYSTEM_NAME);
	}
	
	private LogProcessor(String systemName){
		this.actorSystem = ActorSystem.create("helloakka");
		this.inbox = Inbox.create(actorSystem);
	}
	
	public static LogProcessor create(){
		return new LogProcessor();
	}
	
	public static LogProcessor create(String SystemName){
		return new LogProcessor(SystemName);
	}
	
	public void process(LogRecord log){
		
	}
	
	

}
