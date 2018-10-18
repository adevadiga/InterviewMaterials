package com.twitter.interview.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.twitter.interview.AppConfig;

public class AppConfigTest {
	
	static AppConfig config = null;
	
	@BeforeClass
	public static void setUp(){
		final String filePath = "data/php.ini";
        config = AppConfig.load(filePath, false, "ubuntu", "production");
	}
	
	@Test
	public void testValidSettingKeyInGroup(){		
        Assert.assertEquals("2147483648", config.get("common.paid_users_size_limit"));        
	}
	
	@Test
	public void testInValidSettingKeyValueInGroup(){	
		Assert.assertNull(config.get("ftp.paid_users_size_limit"));
	}
	
	@Test
	public void testOverrideEnabledSettingKey(){
		Assert.assertEquals("/etc/var/uploads", config.get("ftp.path"));
	}
	
	@Test
	public void testValidGroup(){
		Map<String, String> expectedFtpGroupProperty = new HashMap<String,String>();
		expectedFtpGroupProperty.put("name", "hello there, ftp uploading");
		expectedFtpGroupProperty.put("path", "/etc/var/uploads");
		expectedFtpGroupProperty.put("enabled", "no");
		
		Map<String, String> actualFtpGroupProperty = config.getGroup("ftp");
		
		for(Map.Entry<String, String> property:expectedFtpGroupProperty.entrySet()){
			if(actualFtpGroupProperty.containsKey(property.getKey())){
				if(!actualFtpGroupProperty.get(property.getKey()).equals(property.getValue())){
					Assert.fail("Group property does not match");
				}				
			}else{
				Assert.fail("Group property does not match");
			}
		}
	}
	
	@Test
	public void testInValidGroup(){
		Assert.assertNull(config.getGroup("https"));
	}
	
}
