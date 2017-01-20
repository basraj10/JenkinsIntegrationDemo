package com.rb.demoJenkins;

import org.testng.annotations.Test;

public class DemoJenkinsJobs {
	
	
	
	@Test //(dependsOnMethods = "MethodName this method is dependent")
	public void testJenkins(){
		
		
		System.out.println("Welcome to Jenkins worlds");
		
	}
	

}
