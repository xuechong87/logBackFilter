package org.luckystars.logbackfilter;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.luckystars.logbackfilter.api.LogRecord;
import org.luckystars.logbackfilter.api.LogRecordBuilder;

public class LogRecordBuilderImpl implements LogRecordBuilder{

	@Override
	public LogRecord build(HttpServletRequest req) {
		LogRecord rec = new LogRecord();
		rec.setTime(new Date());
		rec.setUrl(req.getRequestURI());
		rec.setPerson("");
		return rec;
	}

}
