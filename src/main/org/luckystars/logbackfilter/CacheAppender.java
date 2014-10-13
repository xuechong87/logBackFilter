package org.luckystars.logbackfilter;

import ch.qos.logback.classic.spi.LoggingEvent;
import ch.qos.logback.core.UnsynchronizedAppenderBase;

public class CacheAppender<E> extends UnsynchronizedAppenderBase<E>{

	@Override
	public void start() {
		// TODO Auto-generated method stub
		super.start();
	}
	
	@Override
	protected void append(E eventObject) {
		if(eventObject instanceof LoggingEvent){
			LoggingEvent event = (LoggingEvent)eventObject;
			if(event.getArgumentArray()[0] instanceof LogEvent){
				LogEvent le = (LogEvent) event.getArgumentArray()[0];
				System.out.println(le.getId());
				System.out.println(le.getName());
			}
		}
		
	}
	
}
