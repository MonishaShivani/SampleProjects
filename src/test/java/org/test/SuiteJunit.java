package org.test;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.RunWith;
import org.junit.runner.notification.Failure;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

public class SuiteJunit {
	@Test
	public void testCase3() {
		
	
		Result rs = JUnitCore.runClasses(SampleJunit.class,Sample.class);
		int r=rs.getRunCount();
		System.out.println(r);
		System.out.println("Ignore count "+rs.getIgnoreCount());
		int s = rs.getFailureCount();
		System.out.println("Failure count"+s);
		List<Failure> failers = rs.getFailures();
		for (Failure x : failers) {
			System.out.println(x);
			
		}
	}

}
