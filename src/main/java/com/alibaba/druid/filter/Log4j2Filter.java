package com.alibaba.druid.filter.logging;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Log4j2Filter extends LogFilter implements Log4j2FilterMBean {

	 public Log4j2Filter()
	    {
	        dataSourceLogger = LogManager.getLogger(dataSourceLoggerName);
	        connectionLogger = LogManager.getLogger(connectionLoggerName);
	        statementLogger = LogManager.getLogger(statementLoggerName);
	        resultSetLogger = LogManager.getLogger(resultSetLoggerName);
	    }

	    public String getDataSourceLoggerName()
	    {
	        return dataSourceLoggerName;
	    }

	    public void setDataSourceLoggerName(String dataSourceLoggerName)
	    {
	        this.dataSourceLoggerName = dataSourceLoggerName;
	        dataSourceLogger = LogManager.getLogger(dataSourceLoggerName);
	    }

	    public void setDataSourceLogger(Logger dataSourceLogger)
	    {
	        this.dataSourceLogger = dataSourceLogger;
	        dataSourceLoggerName = dataSourceLogger.getName();
	    }

	    public String getConnectionLoggerName()
	    {
	        return connectionLoggerName;
	    }

	    public void setConnectionLoggerName(String connectionLoggerName)
	    {
	        this.connectionLoggerName = connectionLoggerName;
	        connectionLogger = LogManager.getLogger(connectionLoggerName);
	    }

	    public void setConnectionLogger(Logger connectionLogger)
	    {
	        this.connectionLogger = connectionLogger;
	        connectionLoggerName = connectionLogger.getName();
	    }

	    public String getStatementLoggerName()
	    {
	        return statementLoggerName;
	    }

	    public void setStatementLoggerName(String statementLoggerName)
	    {
	        this.statementLoggerName = statementLoggerName;
	        statementLogger = LogManager.getLogger(statementLoggerName);
	    }

	    public void setStatementLogger(Logger statementLogger)
	    {
	        this.statementLogger = statementLogger;
	        statementLoggerName = statementLogger.getName();
	    }

	    public String getResultSetLoggerName()
	    {
	        return resultSetLoggerName;
	    }

	    public void setResultSetLoggerName(String resultSetLoggerName)
	    {
	        this.resultSetLoggerName = resultSetLoggerName;
	        resultSetLogger = LogManager.getLogger(resultSetLoggerName);
	    }

	    public void setResultSetLogger(Logger resultSetLogger)
	    {
	        this.resultSetLogger = resultSetLogger;
	        resultSetLoggerName = resultSetLogger.getName();
	    }

	    public boolean isConnectionLogErrorEnabled()
	    {
	        return connectionLogger.isEnabled(Level.ERROR) && super.isConnectionLogErrorEnabled();
	    }

	    public boolean isDataSourceLogEnabled()
	    {
	        return dataSourceLogger.isDebugEnabled() && super.isDataSourceLogEnabled();
	    }

	    public boolean isConnectionLogEnabled()
	    {
	        return connectionLogger.isDebugEnabled() && super.isConnectionLogEnabled();
	    }

	    public boolean isStatementLogEnabled()
	    {
	        return statementLogger.isDebugEnabled() && super.isStatementLogEnabled();
	    }

	    public boolean isResultSetLogEnabled()
	    {
	        return resultSetLogger.isDebugEnabled() && super.isResultSetLogEnabled();
	    }

	    public boolean isResultSetLogErrorEnabled()
	    {
	        return resultSetLogger.isEnabled(Level.ERROR) && super.isResultSetLogErrorEnabled();
	    }

	    public boolean isStatementLogErrorEnabled()
	    {
	        return statementLogger.isEnabled(Level.ERROR) && super.isStatementLogErrorEnabled();
	    }

	    protected void connectionLog(String message)
	    {
	        connectionLogger.debug(message);
	    }

	    protected void statementLog(String message)
	    {
	        statementLogger.debug(message);
	    }

	    protected void resultSetLog(String message)
	    {
	        resultSetLogger.debug(message);
	    }

	    protected void resultSetLogError(String message, Throwable error)
	    {
	        resultSetLogger.error(message, error);
	    }

	    protected void statementLogError(String message, Throwable error)
	    {
	        statementLogger.error(message, error);
	    }

	    private Logger dataSourceLogger;
	    private Logger connectionLogger;
	    private Logger statementLogger;
	    private Logger resultSetLogger;

}
