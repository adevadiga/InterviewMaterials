package com.twitter.interview;

public class App {

	public static void main(String[] args)
    {
        //final String filePath = 0 == args.length ? "/Users/shasrp/test.ini" : args[0];
        //AppConfig config = AppConfig.load(filePath, false, "ubuntu", "production");
        
        org.junit.runner.JUnitCore.main("com.twitter.interview.test.AppConfigTest");       
    }
}
