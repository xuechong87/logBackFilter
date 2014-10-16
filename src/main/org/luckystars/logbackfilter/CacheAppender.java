package org.luckystars.logbackfilter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Observable;

import org.luckystars.logbackfilter.api.LogRecord;

import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.core.UnsynchronizedAppenderBase;

public class CacheAppender<E> extends UnsynchronizedAppenderBase<E>{
	
	private static final int CACHE_INIT_SIZE = 100;
	
	private static final List<LogRecord> logCache = 
			Collections.synchronizedList(new ArrayList<LogRecord>(CACHE_INIT_SIZE));

	@Override
	public void start() {
		super.start();
		
	}
	
	@Override
	protected void append(E eventObject) {
		if(eventObject instanceof LoggingEvent){
			LoggingEvent event = (LoggingEvent)eventObject;
			LogRecord le = (LogRecord) event.getArgumentArray()[0];
			logCache.add(le);
		}
	}
	
	
	
	public List<LogRecord> getLogs(){
		return logCache;
	}
	
	
	static class Worker extends Observable{
		
		
	}
}
