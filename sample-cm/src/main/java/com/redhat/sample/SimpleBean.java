package com.redhat.sample;

//import org.apache.aries.blueprint.compendium.cm.CmPropertyPlaceholder;
import java.util.Dictionary;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SimpleBean {

	private static Logger log = LoggerFactory.getLogger(SimpleBean.class);
	
	private String username;
	public String getUsername() {return username;}
	public void setUsername(String username) {
		log.info("@@ Username " + username);
		this.username = username;
	}

	private String password;
	public String getPassword() {return password;}
	public void setPassword(String password) {
		log.info("@@ Password " + password);
		this.password = password;
	}
	
	private Dictionary<String,Object> myProperties;
	public Dictionary<String, Object> getMyProperties() {return myProperties;}
	public void setMyProperties(Dictionary<String, Object> myProperties) {
		this.myProperties = myProperties;
		log.info("@@ From Dictionary username " + this.myProperties.get("username"));
		log.info("@@ From Dictionary password " + this.myProperties.get("password"));
	}
	
	public SimpleBean(){}
	
	
}
