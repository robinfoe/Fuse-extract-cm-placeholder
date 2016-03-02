package com.redhat.sample;

import java.lang.reflect.Field;
import java.util.Dictionary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PropertyFactory {
	
	private static Logger log = LoggerFactory.getLogger(PropertyFactory.class);
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static Dictionary<String,Object> extractContentPlaceHolder(Object item){
		Dictionary<String, Object> dict = null;
		try{
			Class klass = item.getClass();
			Field field = klass.getDeclaredField("properties");
			field.setAccessible(true);
			dict = (Dictionary<String, Object>)field.get(item);
		}catch(Exception e){
			e.printStackTrace();
			log.error(e.getMessage());
		}
		
		return dict;
	}
	

}
