package org.luckystars.logbackfilter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;

import org.luckystars.logbackfilter.api.LogRecord;
import org.luckystars.logbackfilter.api.LogRecordBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class LogFilter implements Filter {

	private FilterConfig filterConfig;
	private static final String LOGGER_NAME = LogFilter.class.getName();
	private LogRecordBuilder logRecordBuilder = new LogRecordBuilderImpl();
	private static final Logger logger = LoggerFactory.getLogger(LOGGER_NAME);
	
//	private static  ActorSystem ActorSystem; 
//	private static Inbox inbox;
	private static final String SYS_NAME = "logActorSystem";
	
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		this.filterConfig = filterConfig;
//		ActorSystem = akka.actor.ActorSystem.create(SYS_NAME);
//		inbox = Inbox.create(ActorSystem);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		
		if(request instanceof HttpServletRequest){
			HttpServletRequest req = (HttpServletRequest)request;
			processLog(req);
		}
		
		chain.doFilter(request, response);
	}

//	private void processLog(HttpServletRequest req) {
//		LogRecord event = logRecordBuilder.build(req);
//		logger.info(req.getRequestURI(),event);
//	}
	
	
	private void processLog(HttpServletRequest req) {
		LogRecord event = logRecordBuilder.build(req);
		
		
		
		
	}
	
	

	@Override
	public void destroy() {
		
	}

}
