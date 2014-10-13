package org.luckystars.logbackfilter.api;

import javax.servlet.http.HttpServletRequest;

public interface LogRecordBuilder {
	
	LogRecord build(HttpServletRequest req);
	
}
