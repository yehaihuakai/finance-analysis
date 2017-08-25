package com.dion.utils.groovyUtil;


import groovy.lang.GroovyObject;
import groovy.util.GroovyScriptEngine;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

public class GroovyUtils 
{
	private static final Logger LOGGER = LoggerFactory.getLogger(GroovyUtils.class);
	/**
	 * @param groovyFileName
	 * @return
	 * 执行groovy脚本
	 */
	public static Object invokeGroovy(String groovyFileName,String groovyMethodName,Object args)
	{
		if(StringUtils.isEmpty(groovyFileName) || !groovyFileName.contains(".groovy"))
		{
			LOGGER.error("=============groovyFileName is illegal=========");
			return null;
		}
		
		  Object result = null;
		try
		{
			String root = GroovyUtils.class.getResource("/").toURI().getPath()+"groovy";
			GroovyScriptEngine groovyEngine = new GroovyScriptEngine(root);
			GroovyObject groovyObject = (GroovyObject)groovyEngine.loadScriptByName(groovyFileName).newInstance();
		    result = groovyObject.invokeMethod(groovyMethodName, args);    
		}
		catch(Exception e)
		{
			LOGGER.error("=========e:{}",e);
		}
		return result;
	}
	
	/**
	 * @param groovyFileName
	 * @return
	 * 执行groovy脚本
	 */
	public static Object invokeGroovy(String groovyFileName,String filePath,String groovyMethodName,Object args)
	{
		if(StringUtils.isEmpty(groovyFileName) || !groovyFileName.contains(".groovy"))
		{
			LOGGER.error("=============groovyFileName is illegal=========");
			return null;
		}
		
		Object result = null;
		try
		{
			String root = "";
			if(StringUtils.isEmpty(filePath))
			{
				root = GroovyUtils.class.getResource("/").toURI().getPath()+"groovy";
			}
			else
			{
				root  = filePath;
			}
		
			GroovyScriptEngine groovyEngine = new GroovyScriptEngine(root);
			GroovyObject groovyObject = (GroovyObject)groovyEngine.loadScriptByName(groovyFileName).newInstance();
			result = groovyObject.invokeMethod(groovyMethodName, args);    
		}
		catch(Exception e)
		{
			LOGGER.error("=========e:{}",e);
		}
		return result;
	}
}
